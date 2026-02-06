package o;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import o.C3771Nr1;

/* renamed from: o.yS2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class ServiceC10960yS2 extends Service {
    public H50 X;
    public final IBinder Y = new b();
    public String Z = "de_downlaodser";
    public String Y0 = "download_channel";

    /* renamed from: o.yS2$a */
    /* loaded from: classes3.dex */
    public class a implements H50 {
        public a() {
        }

        @Override // o.H50
        public void a() {
            ServiceC10960yS2.this.stopForeground(true);
            ServiceC10960yS2.this.stopSelf();
            H50 h50 = ServiceC10960yS2.this.X;
            if (h50 != null) {
                h50.a();
            }
            Toast.makeText(ServiceC10960yS2.this, "Download completed", 0).show();
        }

        @Override // o.H50
        public void b(C5783dJ1 c5783dJ1) {
            H50 h50 = ServiceC10960yS2.this.X;
            if (h50 != null) {
                h50.b(c5783dJ1);
            }
            String str = ServiceC10960yS2.this.Z;
            Log.d(str, "onProgress: outer: " + c5783dJ1.Y);
        }

        @Override // o.H50
        public void c(C7327je0 c7327je0) {
            H50 h50 = ServiceC10960yS2.this.X;
            if (h50 != null) {
                h50.c(c7327je0);
            }
        }

        @Override // o.H50
        public void d() {
            H50 h50 = ServiceC10960yS2.this.X;
            if (h50 != null) {
                h50.d();
            }
        }

        @Override // o.H50
        public void onCancel() {
            H50 h50 = ServiceC10960yS2.this.X;
            if (h50 != null) {
                h50.onCancel();
            }
            ServiceC10960yS2.this.stopForeground(true);
            ServiceC10960yS2.this.stopSelf();
        }

        @Override // o.H50
        public void onPause() {
            H50 h50 = ServiceC10960yS2.this.X;
            if (h50 != null) {
                h50.onPause();
            }
        }
    }

    /* renamed from: o.yS2$b */
    /* loaded from: classes3.dex */
    public class b extends Binder {
        public b() {
        }

        public ServiceC10960yS2 a() {
            return ServiceC10960yS2.this;
        }
    }

    public void a() {
        GS2.d(this).b();
    }

    public final Notification b(String str) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (Build.VERSION.SDK_INT >= 26) {
            C4842Yr1.a();
            notificationManager.createNotificationChannel(C3086Gr1.a(this.Y0, "Download Service", 2));
        }
        return new C3771Nr1.n(this, this.Y0).O("Download Service").N(str).t0(R.drawable.ic_download).h();
    }

    public void c() {
        GS2.d(this).e();
    }

    public void d() {
        GS2.d(this).f();
    }

    public void e(H50 h50) {
        this.X = h50;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.Y;
    }

    @Override // android.app.Service
    @SuppressLint({"ForegroundServiceType"})
    public int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra = intent.getStringExtra("url");
        String stringExtra2 = intent.getStringExtra("name");
        Toast.makeText(this, "create service", 0).show();
        Log.e(this.Z, "onStartCommand: service");
        if (stringExtra != null && stringExtra2 != null) {
            startForeground(1, b("Download in progress"));
            GS2 d = GS2.d(this);
            d.c(stringExtra, stringExtra2 + ".mp4", new a());
            return 1;
        }
        Log.e(this.Z, "onStartCommand: error in url,filename and path");
        return 1;
    }
}
