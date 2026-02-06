package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.e5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5967e5 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final ImageView b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final ImageView d;
    @InterfaceC5670cr1
    public final TextView e;
    @InterfaceC5670cr1
    public final TextView f;
    @InterfaceC5670cr1
    public final EditText g;
    @InterfaceC5670cr1
    public final LinearLayout h;
    @InterfaceC5670cr1
    public final TextView i;
    @InterfaceC5670cr1
    public final View j;
    @InterfaceC5670cr1
    public final View k;
    @InterfaceC5670cr1
    public final View l;
    @InterfaceC5670cr1
    public final ViewPager2 m;

    public C5967e5(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 ImageView imageView3, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 EditText editText, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 TextView textView3, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, @InterfaceC5670cr1 View view3, @InterfaceC5670cr1 ViewPager2 viewPager2) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = imageView3;
        this.e = textView;
        this.f = textView2;
        this.g = editText;
        this.h = linearLayout2;
        this.i = textView3;
        this.j = view;
        this.k = view2;
        this.l = view3;
        this.m = viewPager2;
    }

    @InterfaceC5670cr1
    public static C5967e5 a(@InterfaceC5670cr1 View view) {
        int i = R.id.downloadd;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.downloadd);
        if (imageView != null) {
            i = R.id.how_to_use;
            ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.how_to_use);
            if (imageView2 != null) {
                i = R.id.ic_back;
                ImageView imageView3 = (ImageView) C6018eH2.a(view, R.id.ic_back);
                if (imageView3 != null) {
                    i = R.id.ic_download;
                    TextView textView = (TextView) C6018eH2.a(view, R.id.ic_download);
                    if (textView != null) {
                        i = R.id.ic_paste;
                        TextView textView2 = (TextView) C6018eH2.a(view, R.id.ic_paste);
                        if (textView2 != null) {
                            i = R.id.inputEditText;
                            EditText editText = (EditText) C6018eH2.a(view, R.id.inputEditText);
                            if (editText != null) {
                                LinearLayout linearLayout = (LinearLayout) view;
                                i = R.id.title;
                                TextView textView3 = (TextView) C6018eH2.a(view, R.id.title);
                                if (textView3 != null) {
                                    i = R.id.view_1;
                                    View a = C6018eH2.a(view, R.id.view_1);
                                    if (a != null) {
                                        i = R.id.view_2;
                                        View a2 = C6018eH2.a(view, R.id.view_2);
                                        if (a2 != null) {
                                            i = R.id.view_3;
                                            View a3 = C6018eH2.a(view, R.id.view_3);
                                            if (a3 != null) {
                                                i = R.id.viewPager;
                                                ViewPager2 viewPager2 = (ViewPager2) C6018eH2.a(view, R.id.viewPager);
                                                if (viewPager2 != null) {
                                                    return new C5967e5(linearLayout, imageView, imageView2, imageView3, textView, textView2, editText, linearLayout, textView3, a, a2, a3, viewPager2);
                                                }
                                            }
                                        }
                                    }
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
    public static C5967e5 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C5967e5 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_download, viewGroup, false);
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
