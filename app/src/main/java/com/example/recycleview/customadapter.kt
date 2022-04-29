package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.customadapter.ViewHolder

//its used to link between between the data and the front end,note Viewholder is used for managing image item views
class customadapter(private val mList:List<itemviewmodel>):RecyclerView.Adapter<ViewHolder>(){
    //create new views to display the items
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       // it inflates the card view_design view that is used to hold list item
        val view=LayoutInflater.from(parent.context).inflate(R.layout.cardview_design,parent,false)
        //inflater to pick the layouts where ever they are just like the card view above
        return ViewHolder(view)
    }
//the one below binds the list of items into a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val itemviewmodel=mList[position]
        //sets the image to the image view from our itemholder class
        holder.imageview.setImageResource(itemviewmodel.image)
    //sets the text to the text view from our itemholder class
        holder.textview.text=itemviewmodel.text}

    //its to return the number of items in the list
    override fun getItemCount(): Int {
        return mList.size}
    //holds the views for adding to the image and text
    class ViewHolder(itemview: View):RecyclerView.ViewHolder(itemview){
        val imageview:ImageView=itemview.findViewById(R.id.imageview)
        val textview:TextView=itemview.findViewById(R.id.textview)
    }

    }
