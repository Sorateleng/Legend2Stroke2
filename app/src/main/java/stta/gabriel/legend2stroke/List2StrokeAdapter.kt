package stta.gabriel.legend2stroke

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import javax.security.auth.callback.Callback

class List2StrokeAdapter(private val list2Stroke: ArrayList<Motor>) :
    RecyclerView.Adapter<List2StrokeAdapter.ListViewHolder>() {

private lateinit var onItemClickCallback: onItemCallback

fun setOnItemClickCallback (onItemClickCallback : onItemCallback){
    this.onItemClickCallback = onItemClickCallback
}


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.row_item_motor, viewGroup, false)
        return ListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val motor = list2Stroke[position]
        Glide.with(holder.itemView.context)
            .load(motor.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = motor.name
        holder.tvDetail.text = motor.detail


        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(list2Stroke[holder.adapterPosition]) }

    }

    override fun getItemCount(): Int {
        return list2Stroke.size

    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_nama)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_foto)


    }

    interface onItemCallback {
fun onItemClicked(data: Motor)
    }
}