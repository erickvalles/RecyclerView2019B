package guerrero.erick.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.mi_tarjeta.view.*

class LugarAdapter(lugares:ArrayList<Lugar>, context:Context): RecyclerView.Adapter<LugarAdapter.ViewHolder>() {


    var lugares:ArrayList<Lugar>?=null
    var context:Context?=null

    init {
        this.lugares = lugares
        this.context = context
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vistaLugar:View = LayoutInflater.from(context)
            .inflate(R.layout.mi_tarjeta,parent,false)
        val lugarViewHolder = ViewHolder(vistaLugar)
        vistaLugar.tag = lugarViewHolder
        return lugarViewHolder
    }

    override fun getItemCount(): Int {
        return lugares!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nombre!!.text = lugares!![position].nombre
        holder.descripcion!!.text = lugares!![position].descripcion

    }



    class ViewHolder(vista:View):RecyclerView.ViewHolder(vista) {
        var imagen:ImageView?=null
        var nombre:TextView? = null
        var descripcion:TextView?=null

        init {
            imagen = vista.imageView
            nombre = vista.tvEncabezado
            descripcion = vista.tvDescripcion
        }

    }
}