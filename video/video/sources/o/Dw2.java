package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class Dw2 {
    @InterfaceC11300zs1
    public static Typeface a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    @InterfaceC11300zs1
    public static Typeface b(@InterfaceC5670cr1 Configuration configuration, @InterfaceC5670cr1 Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            if (i != Integer.MAX_VALUE) {
                i2 = configuration.fontWeightAdjustment;
                if (i2 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i3 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, C9293rd1.e(weight + i3, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
