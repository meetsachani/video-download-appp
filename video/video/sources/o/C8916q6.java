package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.q6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8916q6 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final ImageView b;
    @InterfaceC5670cr1
    public final TabLayout c;
    @InterfaceC5670cr1
    public final TextView d;
    @InterfaceC5670cr1
    public final ViewPager2 e;

    public C8916q6(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 TabLayout tabLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 ViewPager2 viewPager2) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = tabLayout;
        this.d = textView;
        this.e = viewPager2;
    }

    @InterfaceC5670cr1
    public static C8916q6 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ic_back;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.ic_back);
        if (imageView != null) {
            i = R.id.tabLayout;
            TabLayout tabLayout = (TabLayout) C6018eH2.a(view, R.id.tabLayout);
            if (tabLayout != null) {
                i = R.id.tvTitle;
                TextView textView = (TextView) C6018eH2.a(view, R.id.tvTitle);
                if (textView != null) {
                    i = R.id.viewPager;
                    ViewPager2 viewPager2 = (ViewPager2) C6018eH2.a(view, R.id.viewPager);
                    if (viewPager2 != null) {
                        return new C8916q6((LinearLayout) view, imageView, tabLayout, textView, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C8916q6 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C8916q6 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_watch, viewGroup, false);
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
