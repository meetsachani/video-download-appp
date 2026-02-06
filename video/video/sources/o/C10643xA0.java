package o;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.MyApplication;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.xA0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10643xA0 {
    public final C11041yo1 a = new C11041yo1();
    public final Activity b;
    public Dialog c;

    public C10643xA0(Activity activity) {
        this.b = activity;
    }

    public void a() {
        try {
            Dialog dialog = this.c;
            if (dialog != null && dialog.isShowing() && !this.b.isFinishing() && !this.b.isDestroyed()) {
                this.c.dismiss();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void b(String str) {
        Dialog dialog = this.c;
        if (dialog != null && dialog.isShowing()) {
            return;
        }
        MyApplication.Y0 = false;
        Dialog dialog2 = new Dialog(this.b);
        this.c = dialog2;
        dialog2.requestWindowFeature(1);
        this.c.setContentView(R.layout.full_ad_loader_progressbar);
        this.c.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.c.getWindow().setLayout(-1, -1);
        this.b.getWindow().setFlags(1024, 1024);
        this.b.getWindow().addFlags(128);
        if (!C2723Dd.P().equals("Load") && C2723Dd.A()) {
            this.a.p(this.b, (ShimmerFrameLayout) this.c.findViewById(R.id.shimmer_native1), this.c.findViewById(R.id.small_native1), (FrameLayout) this.c.findViewById(R.id.fl_adplaceholder_small1));
            this.a.q(this.b, (ShimmerFrameLayout) this.c.findViewById(R.id.shimmer_native2), this.c.findViewById(R.id.small_native2), (FrameLayout) this.c.findViewById(R.id.fl_adplaceholder_small2));
            this.a.r(this.b, (ShimmerFrameLayout) this.c.findViewById(R.id.shimmer_native3), this.c.findViewById(R.id.small_native3), (FrameLayout) this.c.findViewById(R.id.fl_adplaceholder_small3));
            this.a.s(this.b, (ShimmerFrameLayout) this.c.findViewById(R.id.shimmer_native4), this.c.findViewById(R.id.small_native4), (FrameLayout) this.c.findViewById(R.id.fl_adplaceholder_small4));
            this.a.t(this.b, (ShimmerFrameLayout) this.c.findViewById(R.id.shimmer_native5), this.c.findViewById(R.id.small_native5), (FrameLayout) this.c.findViewById(R.id.fl_adplaceholder_small5));
        } else {
            this.c.findViewById(R.id.shimmer_native1).setVisibility(8);
            this.c.findViewById(R.id.small_native1).setVisibility(8);
            this.c.findViewById(R.id.fl_adplaceholder_small1).setVisibility(8);
            this.c.findViewById(R.id.shimmer_native2).setVisibility(8);
            this.c.findViewById(R.id.small_native2).setVisibility(8);
            this.c.findViewById(R.id.fl_adplaceholder_small2).setVisibility(8);
            this.c.findViewById(R.id.shimmer_native3).setVisibility(8);
            this.c.findViewById(R.id.small_native3).setVisibility(8);
            this.c.findViewById(R.id.fl_adplaceholder_small3).setVisibility(8);
            this.c.findViewById(R.id.shimmer_native4).setVisibility(8);
            this.c.findViewById(R.id.small_native4).setVisibility(8);
            this.c.findViewById(R.id.fl_adplaceholder_small4).setVisibility(8);
            this.c.findViewById(R.id.shimmer_native5).setVisibility(8);
            this.c.findViewById(R.id.small_native5).setVisibility(8);
            this.c.findViewById(R.id.fl_adplaceholder_small5).setVisibility(8);
        }
        this.c.setCancelable(false);
        this.c.show();
    }
}
