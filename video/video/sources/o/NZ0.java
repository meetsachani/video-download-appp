package o;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class NZ0 extends Service implements KZ0 {
    public final androidx.lifecycle.s X = new androidx.lifecycle.s(this);

    @Override // o.KZ0
    public androidx.lifecycle.f b() {
        return this.X.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        C6562gT0.p(intent, C9998uW1.R);
        this.X.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.X.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.X.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    @InterfaceC9150r20(message = "Deprecated in Java")
    public void onStart(Intent intent, int i) {
        this.X.e();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
