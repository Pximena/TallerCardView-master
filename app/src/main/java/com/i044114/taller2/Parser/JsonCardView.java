package com.i044114.taller2.Parser;

import com.i044114.taller2.Models.CardView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aula7 on 3/10/17.
 */

public class JsonCardView {
    public static List<CardView> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<CardView> cardViewList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject item = jsonArray.getJSONObject(i);
            CardView cardView = new CardView();
            cardView.setTitulo(item.getString("title"));
            cardView.setUrl(item.getString("url"));
            cardView.setUrltext(item.getString("thumbnailUrl"));
            cardViewList.add(cardView);
        }
        return cardViewList;
    }

    public static String[] listUsersDos() {
        return new String[]{
                "https://i.pinimg.com/originals/86/05/73/8605736bfdf8b5968ae9e30ffadd6299.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6llIrwSaO7ZShQRqD9UjC-VeP-vdCEIKYP5ulc57bBE1dTMPy",
                "http://flashwallpapers.com/wp-content/uploads/2015/10/Lovely-Garden-1440x900.jpg",
                "http://paisajesylugaresmashermososdelmundo.com/wp-content/uploads/2015/12/imagenes-de-bellos-paisajes-1.jpg",
                "http://imagenesdepaisajes.net/wp-content/uploads/2016/07/fondos-de-paisajes-naturales-floridos.jpg",
                "https://i.pinimg.com/736x/1d/44/5c/1d445c7407aeb501daaa7febe7c8cea5--sunset-art-fantasy-landscape.jpg",
                "http://1.bp.blogspot.com/-SdMhMi16P-w/Ukt8Hv-McKI/AAAAAAAAG-Q/4pPMZjXpAMQ/s1600/paisajes-hermosos-cascada.jpg",
                "https://i.pinimg.com/736x/a3/2a/78/a32a7848823def9a01fc0060641ed324--stone-cottages-country-cottages.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvRaXZ2Iq4hKBD5d4mfEW47tINNsrEcBCDEmmPDq04ePbTGYM3",
                "https://k03.kn3.net/1A5AFE466.jpg"
        };

    }
}
