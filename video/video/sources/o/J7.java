package o;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class J7 {
    public static int a;
    public static HashMap<Integer, View> b = new HashMap<>();
    public static NativeAdView c;

    public static void a(Activity activity, LinearLayout linearLayout, LinearLayout linearLayout2, boolean z, int i) {
        a = i;
        C11284zo1.b = Boolean.valueOf(z);
        HashMap<Integer, View> hashMap = b;
        if (hashMap != null && hashMap.get(Integer.valueOf(i)) != null) {
            try {
                if (b.get(Integer.valueOf(i)).getParent() != null) {
                    ((ViewGroup) b.get(Integer.valueOf(i)).getParent()).removeView(b.get(Integer.valueOf(i)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                c(activity, linearLayout, linearLayout2, i);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (C2723Dd.k().equals("admob")) {
            if (C2723Dd.l().equals("Load")) {
                if (C11284zo1.d) {
                    C11284zo1.d = false;
                    C11284zo1.b = Boolean.valueOf(z);
                    C11284zo1.a(activity, linearLayout, linearLayout2, z);
                    return;
                }
                return;
            }
            C11284zo1.b = Boolean.valueOf(z);
            C11284zo1.b(activity, linearLayout, linearLayout2, z);
        } else if (C2723Dd.l().equals("Load")) {
            C11284zo1.d(activity, linearLayout, linearLayout2, z);
        } else {
            C11284zo1.f(activity, linearLayout, linearLayout2, z);
        }
    }

    public static void b(Context context, LinearLayout linearLayout, LinearLayout linearLayout2, int i) {
        a = i;
        HashMap<Integer, View> hashMap = b;
        if (hashMap != null && hashMap.get(Integer.valueOf(i)) != null) {
            try {
                if (b.get(Integer.valueOf(i)).getParent() != null) {
                    ((ViewGroup) b.get(Integer.valueOf(i)).getParent()).removeView(b.get(Integer.valueOf(i)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                c(context, linearLayout, linearLayout2, i);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (C2723Dd.k().equals("admob")) {
            C2723Dd.u().equals("banner");
        }
    }

    public static void c(Context context, LinearLayout linearLayout, LinearLayout linearLayout2, int i) {
        if (b.get(Integer.valueOf(i)) != null) {
            linearLayout.removeAllViews();
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            Log.e("NativeFull_Show", "admob Native ad show : ");
            linearLayout.addView(b.get(Integer.valueOf(i)));
            return;
        }
        linearLayout2.setVisibility(8);
        linearLayout.setVisibility(8);
    }
}
