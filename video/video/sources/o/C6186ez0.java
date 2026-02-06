package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.ez0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6186ez0 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final LinearLayout a;
    @InterfaceC5670cr1
    public final EditText b;
    @InterfaceC5670cr1
    public final ImageView c;
    @InterfaceC5670cr1
    public final ImageView d;
    @InterfaceC5670cr1
    public final ImageView e;
    @InterfaceC5670cr1
    public final ImageView f;
    @InterfaceC5670cr1
    public final ImageView g;
    @InterfaceC5670cr1
    public final ImageView h;
    @InterfaceC5670cr1
    public final ImageView i;
    @InterfaceC5670cr1
    public final LinearLayout j;
    @InterfaceC5670cr1
    public final LinearLayout k;
    @InterfaceC5670cr1
    public final LinearLayout l;
    @InterfaceC5670cr1
    public final LinearLayout m;
    @InterfaceC5670cr1
    public final LinearLayout n;
    @InterfaceC5670cr1

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f734o;
    @InterfaceC5670cr1
    public final LinearLayout p;
    @InterfaceC5670cr1
    public final LinearLayout q;

    public C6186ez0(@InterfaceC5670cr1 LinearLayout linearLayout, @InterfaceC5670cr1 EditText editText, @InterfaceC5670cr1 ImageView imageView, @InterfaceC5670cr1 ImageView imageView2, @InterfaceC5670cr1 ImageView imageView3, @InterfaceC5670cr1 ImageView imageView4, @InterfaceC5670cr1 ImageView imageView5, @InterfaceC5670cr1 ImageView imageView6, @InterfaceC5670cr1 ImageView imageView7, @InterfaceC5670cr1 LinearLayout linearLayout2, @InterfaceC5670cr1 LinearLayout linearLayout3, @InterfaceC5670cr1 LinearLayout linearLayout4, @InterfaceC5670cr1 LinearLayout linearLayout5, @InterfaceC5670cr1 LinearLayout linearLayout6, @InterfaceC5670cr1 LinearLayout linearLayout7, @InterfaceC5670cr1 LinearLayout linearLayout8, @InterfaceC5670cr1 LinearLayout linearLayout9) {
        this.a = linearLayout;
        this.b = editText;
        this.c = imageView;
        this.d = imageView2;
        this.e = imageView3;
        this.f = imageView4;
        this.g = imageView5;
        this.h = imageView6;
        this.i = imageView7;
        this.j = linearLayout2;
        this.k = linearLayout3;
        this.l = linearLayout4;
        this.m = linearLayout5;
        this.n = linearLayout6;
        this.f734o = linearLayout7;
        this.p = linearLayout8;
        this.q = linearLayout9;
    }

    @InterfaceC5670cr1
    public static C6186ez0 a(@InterfaceC5670cr1 View view) {
        int i = R.id.edit_text;
        EditText editText = (EditText) C6018eH2.a(view, R.id.edit_text);
        if (editText != null) {
            i = R.id.how_to_use;
            ImageView imageView = (ImageView) C6018eH2.a(view, R.id.how_to_use);
            if (imageView != null) {
                i = R.id.ic_direct_chat;
                ImageView imageView2 = (ImageView) C6018eH2.a(view, R.id.ic_direct_chat);
                if (imageView2 != null) {
                    i = R.id.ic_my_download;
                    ImageView imageView3 = (ImageView) C6018eH2.a(view, R.id.ic_my_download);
                    if (imageView3 != null) {
                        i = R.id.ic_player;
                        ImageView imageView4 = (ImageView) C6018eH2.a(view, R.id.ic_player);
                        if (imageView4 != null) {
                            i = R.id.ic_setting;
                            ImageView imageView5 = (ImageView) C6018eH2.a(view, R.id.ic_setting);
                            if (imageView5 != null) {
                                i = R.id.ic_watch;
                                ImageView imageView6 = (ImageView) C6018eH2.a(view, R.id.ic_watch);
                                if (imageView6 != null) {
                                    i = R.id.iv_download;
                                    ImageView imageView7 = (ImageView) C6018eH2.a(view, R.id.iv_download);
                                    if (imageView7 != null) {
                                        i = R.id.linerFacebook;
                                        LinearLayout linearLayout = (LinearLayout) C6018eH2.a(view, R.id.linerFacebook);
                                        if (linearLayout != null) {
                                            i = R.id.linerInstagram;
                                            LinearLayout linearLayout2 = (LinearLayout) C6018eH2.a(view, R.id.linerInstagram);
                                            if (linearLayout2 != null) {
                                                i = R.id.linerLinkedin;
                                                LinearLayout linearLayout3 = (LinearLayout) C6018eH2.a(view, R.id.linerLinkedin);
                                                if (linearLayout3 != null) {
                                                    i = R.id.linerPinterest;
                                                    LinearLayout linearLayout4 = (LinearLayout) C6018eH2.a(view, R.id.linerPinterest);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.linerThread;
                                                        LinearLayout linearLayout5 = (LinearLayout) C6018eH2.a(view, R.id.linerThread);
                                                        if (linearLayout5 != null) {
                                                            i = R.id.linerTikTok;
                                                            LinearLayout linearLayout6 = (LinearLayout) C6018eH2.a(view, R.id.linerTikTok);
                                                            if (linearLayout6 != null) {
                                                                i = R.id.linerWABusiness;
                                                                LinearLayout linearLayout7 = (LinearLayout) C6018eH2.a(view, R.id.linerWABusiness);
                                                                if (linearLayout7 != null) {
                                                                    i = R.id.linerWhatsapp;
                                                                    LinearLayout linearLayout8 = (LinearLayout) C6018eH2.a(view, R.id.linerWhatsapp);
                                                                    if (linearLayout8 != null) {
                                                                        return new C6186ez0((LinearLayout) view, editText, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C6186ez0 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C6186ez0 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_main, viewGroup, false);
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
