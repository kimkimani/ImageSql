package tips.admin.tipsscore.imagesql;


import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by quocnguyen on 03/08/2016.
 */
public class CustomListAdapter extends ArrayAdapter<Product> {
CardView cardview;
    ArrayList<Product> products;
    Context context;
    int resource;

    public CustomListAdapter(Context context, int resource, ArrayList<Product> products) {
        super(context, resource, products);


        this.products = products;
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ;
        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.listprofile, null, true);

        }
        Product product = getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.profilemain);
        Picasso.with(context).load(product.getImage())

                .error(R.drawable.error)
                .into(imageView);

        TextView txtName = (TextView) convertView.findViewById(R.id.name);
        txtName.setText(product.getName());

        TextView txtgoals = (TextView) convertView.findViewById(R.id.goals);
        txtgoals.setText(product.getGaols ());

        TextView txtassits = (TextView) convertView.findViewById(R.id.assists);
        txtassits.setText(product.getAssits ());

        TextView txtclean = (TextView) convertView.findViewById(R.id.cleansheets);
        txtclean.setText(product.getCleansheet ());

        TextView txtrating = (TextView) convertView.findViewById(R.id.rating);
        txtrating.setText(product.getRating ());

        TextView txtSTAT= (TextView) convertView.findViewById(R.id.stats);
        txtSTAT.setText(product.getStats ());

        TextView txtyellow = (TextView) convertView.findViewById(R.id.yellow);
        txtyellow.setText(product.getYellow ());

        TextView txtred = (TextView) convertView.findViewById(R.id.red);
        txtred.setText(product.getRed ());

        TextView txtclub = (TextView) convertView.findViewById(R.id.club);
        txtclub.setText(product.getClub ());

        TextView txtposition = (TextView) convertView.findViewById(R.id.position);
        txtposition.setText(product.getPosition ());

        TextView txtmatch = (TextView) convertView.findViewById(R.id.match);
        txtmatch.setText(product.getMatch ());

        TextView txtprice = (TextView) convertView.findViewById(R.id.price);
        txtprice.setText(product.getPrice ());

        TextView txtnarrate = (TextView) convertView.findViewById(R.id.naration);
        txtnarrate.setText(product.getNarration ());

        TextView txtweek = (TextView) convertView.findViewById(R.id.gameweek);
        txtweek.setText(product.getGameweek ());



        return convertView;
    }
}