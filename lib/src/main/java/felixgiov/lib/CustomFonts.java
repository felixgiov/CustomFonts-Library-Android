package felixgiov.lib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by felix on 18 Jan 2017.
 *
 * @Author Felix Giovanni Virgo
 * @Github https://github.com/felixgiov
 */

public class CustomFonts extends TextView {

    public CustomFonts(Context context) {
        this(context, null);
    }

    public CustomFonts(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray array = context.obtainStyledAttributes(attrs,
                R.styleable.CustomFonts, 0, 0);
        String path_font = array.getString(R.styleable.CustomFonts_fontPath);

        array.recycle();
        if (path_font != null) {
            setCustomFonts(context, path_font);
        } else {
            setCustomFonts(context, "fonts/Expressive-Inks.ttf");
        }
    }

    private void setCustomFonts(Context context, String path_font) {
        Typeface typeFaces = Typeface.createFromAsset(context.getAssets(), path_font);
        this.setTypeface(typeFaces);
    }

}
