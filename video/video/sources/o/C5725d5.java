package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.d5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5725d5 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final ImageView b;
    @InterfaceC5670cr1
    public final EditText c;
    @InterfaceC5670cr1
    public final LinearLayout d;
    @InterfaceC5670cr1
    public final LinearLayout e;
    @InterfaceC5670cr1
    public final LinearLayout f;
    @InterfaceC5670cr1
    public final Spinner g;
    @InterfaceC5670cr1
    public final LinearLayout h;
    @InterfaceC5670cr1
    public final TextView i;
    @InterfaceC5670cr1
    public final TextView j;
    @InterfaceC5670cr1
    public final TextView k;

    public C5725d5(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 EditText editText, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 LinearLayout linearLayout3, @InterfaceC5670cr1 LinearLayout linearLayout4, @InterfaceC5670cr1 Spinner spinner, @InterfaceC5670cr1 LinearLayout linearLayout5, @InterfaceC5670cr1 TextView textView, @InterfaceC5670cr1 TextView textView2, @InterfaceC5670cr1 TextView textView3) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = editText;
        this.d = linearLayout2;
        this.e = linearLayout3;
        this.f = linearLayout4;
        this.g = spinner;
        this.h = linearLayout5;
        this.i = textView;
        this.j = textView2;
        this.k = textView3;
    }

    @InterfaceC5670cr1
    public static C5725d5 a(@InterfaceC5670cr1 View view) {
        int i = R.id.ic_back;
        ImageView imageView = (ImageView) C6018eH2.a(view, R.id.ic_back);
        if (imageView != null) {
            i = R.id.mEtMobileNumber;
            EditText editText = (EditText) C6018eH2.a(view, R.id.mEtMobileNumber);
            if (editText != null) {
                i = R.id.mImgWChat;
                LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.mImgWChat);
                if (linearLayout != null) {
                    i = R.id.mImgWbChat;
                    LinearLayout linearLayout2 = (LinearLayout) C6018eH2.a(view, R.id.mImgWbChat);
                    if (linearLayout2 != null) {
                        i = R.id.mLlCountryCode;
                        LinearLayout linearLayout3 = (LinearLayout) C6018eH2.a(view, R.id.mLlCountryCode);
                        if (linearLayout3 != null) {
                            i = R.id.mSpCountryCode;
                            Spinner spinner = (Spinner) C6018eH2.a(view, R.id.mSpCountryCode);
                            if (spinner != null) {
                                LinearLayout linearLayout4 = (LinearLayout) view;
                                i = R.id.tvGuideStep1;
                                TextView textView = (TextView) C6018eH2.a(view, R.id.tvGuideStep1);
                                if (textView != null) {
                                    i = R.id.tvGuideStep2;
                                    TextView textView2 = (TextView) C6018eH2.a(view, R.id.tvGuideStep2);
                                    if (textView2 != null) {
                                        i = R.id.tvGuideTitle;
                                        TextView textView3 = (TextView) C6018eH2.a(view, R.id.tvGuideTitle);
                                        if (textView3 != null) {
                                            return new C5725d5(linearLayout4, imageView, editText, linearLayout, linearLayout2, linearLayout3, spinner, linearLayout4, textView, textView2, textView3);
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
    public static C5725d5 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C5725d5 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_direct_chat, viewGroup, false);
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
