package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.j5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7192j5 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final ImageView b;
    @InterfaceC5670cr1
    public final TextView c;
    @InterfaceC5670cr1
    public final TextView d;
    @InterfaceC5670cr1
    public final View e;
    @InterfaceC5670cr1
    public final View f;
    @InterfaceC5670cr1
    public final View g;
    @InterfaceC5670cr1
    public final ViewPager h;

    public C7192j5(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, @InterfaceC5670cr1 View view3, @InterfaceC5670cr1 ViewPager viewPager) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = view;
        this.f = view2;
        this.g = view3;
        this.h = viewPager;
    }

    @InterfaceC5670cr1
    public static C7192j5 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ic_back;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.ic_back);
        if (imageView != null) {
            i = R.id.skip;
            TextView textView = (TextView) C6018eH2.a(view, R.id.skip);
            if (textView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) C6018eH2.a(view, R.id.title);
                if (textView2 != null) {
                    i = R.id.view_1;
                    View a = C6018eH2.a(view, R.id.view_1);
                    if (a != null) {
                        i = R.id.view_2;
                        View a2 = C6018eH2.a(view, R.id.view_2);
                        if (a2 != null) {
                            i = R.id.view_3;
                            View a3 = C6018eH2.a(view, R.id.view_3);
                            if (a3 != null) {
                                i = R.id.vpHome;
                                ViewPager viewPager = (ViewPager) C6018eH2.a(view, R.id.vpHome);
                                if (viewPager != null) {
                                    return new C7192j5((LinearLayout) view, imageView, textView, textView2, a, a2, a3, viewPager);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C7192j5 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C7192j5 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_how_to_use, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // o.InterfaceC5776dH2
    @InterfaceC5670cr1
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.a;
    }
}
