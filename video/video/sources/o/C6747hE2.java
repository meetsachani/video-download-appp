package o;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.hE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6747hE2 {
    public static Dialog a;
    public static g b;
    public static f c;
    public static Dialog d;

    /* renamed from: o.hE2$a */
    /* loaded from: classes3.dex */
    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C6747hE2.c.a(false);
        }
    }

    /* renamed from: o.hE2$b */
    /* loaded from: classes3.dex */
    public class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ Context X;

        public b(Context context) {
            this.X = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C6747hE2.c(this.X);
        }
    }

    /* renamed from: o.hE2$c */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C6747hE2.b.a();
        }
    }

    /* renamed from: o.hE2$d */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ Activity X;

        public d(Activity activity) {
            this.X = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.X.finishAffinity();
        }
    }

    /* renamed from: o.hE2$e */
    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C6747hE2.d.dismiss();
        }
    }

    /* renamed from: o.hE2$f */
    /* loaded from: classes3.dex */
    public interface f {
        void a(boolean z);
    }

    /* renamed from: o.hE2$g */
    /* loaded from: classes3.dex */
    public interface g {
        void a();
    }

    public static void c(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            c.a(true);
            return;
        }
        try {
            h(context, context.getString(R.string.app_name), context.getString(R.string.disconnected), "Retry");
        } catch (NumberFormatException unused) {
        }
    }

    public static void d(Activity activity) {
        Dialog dialog = new Dialog(activity);
        d = dialog;
        dialog.requestWindowFeature(1);
        d.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        d.setContentView(R.layout.custom_exit_dialog);
        d.getWindow().setLayout(-1, -1);
        Window window = d.getWindow();
        window.setLayout(-1, -2);
        window.setFlags(1024, 1024);
        window.getDecorView().setSystemUiVisibility(6);
        d.getWindow().setGravity(17);
        d.getWindow().getAttributes().windowAnimations = R.style.ExitDialogAnimation;
        d.setCancelable(true);
        d.setCanceledOnTouchOutside(true);
        C11284zo1.c(activity, (LinearLayout) d.findViewById(R.id.llnative_full), (LinearLayout) d.findViewById(R.id.llline_full), Boolean.TRUE);
        ((TextView) d.findViewById(R.id.txt_done)).setOnClickListener(new d(activity));
        ((TextView) d.findViewById(R.id.cancel)).setOnClickListener(new e());
        d.show();
    }

    public static void e(Context context) {
        a = new Dialog(context);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(a.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        a.requestWindowFeature(1);
        a.setCancelable(false);
        a.setContentView(R.layout.internet_dialogue);
        a.show();
        a.getWindow().setAttributes(layoutParams);
        ((LinearLayout) a.findViewById(R.id.ln_try_again)).setOnClickListener(new c());
    }

    public static void f(g gVar) {
        b = gVar;
    }

    public static boolean g(Activity activity) {
        ConnectivityManager connectivityManager = (ConnectivityManager) activity.getSystemService("connectivity");
        if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected()) {
            return true;
        }
        return false;
    }

    public static void h(Context context, String str, String str2, String str3) {
        new AlertDialog.Builder(context).setIcon(17301543).setTitle(str).setMessage(str2).setCancelable(false).setPositiveButton(str3, new b(context)).setNegativeButton("No", new a()).show();
    }
}
