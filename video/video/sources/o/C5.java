package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public final class C5 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final LinearLayout b;
    @InterfaceC5670cr1
    public final WebView c;

    public C5(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 WebView webView) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = webView;
    }

    @InterfaceC5670cr1
    public static C5 a(@InterfaceC5670cr1 View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        WebView webView = (WebView) C6018eH2.a(view, R.id.webview);
        if (webView != null) {
            return new C5(linearLayout, linearLayout, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.webview)));
    }

    @InterfaceC5670cr1
    public static C5 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C5 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_play_daily, viewGroup, false);
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
