package com.mic.findcrush.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mic.mycart.Cart
import com.mic.mycart.R
import kotlinx.android.synthetic.main.itemmycart.view.*


class PostRecyclerCustomAdapter(var postlist:ArrayList<Cart>) :RecyclerView.Adapter<PostRecyclerCustomAdapter.postViewHolder>(){
    inner  class  postViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun postData(post: Cart){
            itemView.iv_foodtypeimg.setImageResource(post.foodtype)
            itemView.tv_foodname.text=post.foodname
            itemView.btn_discount.text=post.discount
            itemView.tv_pricevalue.text=post.price
            itemView.tv_gram.text=post.gram

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): postViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.itemmycart,parent,false)
        return postViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  postlist.size
    }

    override fun onBindViewHolder(holder: postViewHolder, position: Int) {
        holder.postData(postlist[position])
    }

}