package com.example.nityaarora.noteshub

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RecyclerAdapter(var arr: ArrayList<List_item>) : RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerHolder {
      var li : LayoutInflater = p0.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        var itemView:View=li.inflate(R.layout.list_item,p0,false)

        return RecyclerHolder(itemView)

    }

    override fun getItemCount(): Int {
        return arr.size;
    }

    override fun onBindViewHolder(p0: RecyclerHolder, p1: Int) {
        var item:List_item=arr.get(p1)
        p0.tvUser.text=item.user_name
        p0.tvDate.text=item.date
        p0.tvViews.text=item.views
        p0.tvStars.text=item.stars
        p0.tvDownloads.text=item.downloads

    }

    class RecyclerHolder : RecyclerView.ViewHolder {
         var tvUser:TextView
         var tvDate:TextView
         var tvViews:TextView
         var tvStars:TextView
         var tvDownloads:TextView

        constructor(itemView: View):super(itemView){

            tvUser=itemView.findViewById(R.id.user_name)
            tvDate=itemView.findViewById(R.id.date)
            tvViews=itemView.findViewById(R.id.views)
            tvStars=itemView.findViewById(R.id.stars)
            tvDownloads=itemView.findViewById(R.id.downloads)

        }
    }

}