package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.tz0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9866tz0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final TextView b;
    @InterfaceC5670cr1
    public final TextView c;
    @InterfaceC5670cr1
    public final TextView d;
    @InterfaceC5670cr1
    public final EditText e;
    @InterfaceC5670cr1
    public final ImageView f;
    @InterfaceC5670cr1
    public final ImageView g;
    @InterfaceC5670cr1
    public final TextView h;

    public C9866tz0(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 TextView textView3, @InterfaceC5670cr1 EditText editText, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 TextView textView4) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = editText;
        this.f = imageView;
        this.g = imageView2;
        this.h = textView4;
    }

    @InterfaceC5670cr1
    public static C9866tz0 a(@InterfaceC5670cr1 View view) {
        int i = R.id.decelerate;
        TextView textView = (TextView) C6018eH2.a(view, R.id.decelerate);
        if (textView != null) {
            i = R.id.ic_download;
            TextView textView2 = (TextView) C6018eH2.a(view, R.id.ic_download);
            if (textView2 != null) {
                i = R.id.ic_paste;
                TextView textView3 = (TextView) C6018eH2.a(view, R.id.ic_paste);
                if (textView3 != null) {
                    i = R.id.inputEditText;
                    EditText editText = (EditText) C6018eH2.a(view, R.id.inputEditText);
                    if (editText != null) {
                        i = R.id.iv_download;
                        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.iv_download);
                        if (imageView != null) {
                            i = R.id.iv_paste;
                            ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.iv_paste);
                            if (imageView2 != null) {
                                i = R.id.title;
                                TextView textView4 = (TextView) C6018eH2.a(view, R.id.title);
                                if (textView4 != null) {
                                    return new C9866tz0((LinearLayout) view, textView, textView2, textView3, editText, imageView, imageView2, textView4);
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
    public static C9866tz0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C9866tz0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_setupone, viewGroup, false);
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
