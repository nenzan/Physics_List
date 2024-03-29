package id.compunerd.physicslist

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListSainsAdapter(private val listSains: ArrayList<Sains>) :
    RecyclerView.Adapter<ListSainsAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_physics, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSains.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, detail, photo) = listSains[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvDetail.text = detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClick(listSains[holder.adapterPosition])
            val intent = Intent(it.context, DetailSainsActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("email", detail)
            it.context.startActivity(intent)
        }
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailSainsActivity::class.java)
                itemView.context.startActivity(intent)
            }
        }
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClick(data: Sains)
    }
}