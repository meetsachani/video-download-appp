package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class DM {
    @InterfaceC11300zs1
    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
