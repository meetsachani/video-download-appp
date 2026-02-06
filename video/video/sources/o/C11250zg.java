package o;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

@Deprecated
/* renamed from: o.zg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11250zg {
    public final Context a;
    public final f b;
    public final Handler c;
    @InterfaceC11300zs1
    public final c d;
    @InterfaceC11300zs1
    public final BroadcastReceiver e;
    @InterfaceC11300zs1
    public final d f;
    @InterfaceC11300zs1
    public C10764xg g;
    public boolean h;

    @ES1(23)
    /* renamed from: o.zg$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @K40
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) C9542sf.g((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        @K40
        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) C9542sf.g((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    @ES1(23)
    /* renamed from: o.zg$c */
    /* loaded from: classes2.dex */
    public final class c extends AudioDeviceCallback {
        public c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            C11250zg c11250zg = C11250zg.this;
            c11250zg.c(C10764xg.c(c11250zg.a));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            C11250zg c11250zg = C11250zg.this;
            c11250zg.c(C10764xg.c(c11250zg.a));
        }
    }

    /* renamed from: o.zg$d */
    /* loaded from: classes2.dex */
    public final class d extends ContentObserver {
        public final ContentResolver a;
        public final Uri b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.a = contentResolver;
            this.b = uri;
        }

        public void a() {
            this.a.registerContentObserver(this.b, false, this);
        }

        public void b() {
            this.a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            C11250zg c11250zg = C11250zg.this;
            c11250zg.c(C10764xg.c(c11250zg.a));
        }
    }

    /* renamed from: o.zg$e */
    /* loaded from: classes2.dex */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                C11250zg.this.c(C10764xg.d(context, intent));
            }
        }
    }

    /* renamed from: o.zg$f */
    /* loaded from: classes2.dex */
    public interface f {
        void a(C10764xg c10764xg);
    }

    public C11250zg(Context context, f fVar) {
        c cVar;
        e eVar;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = (f) C9542sf.g(fVar);
        Handler E = TD2.E();
        this.c = E;
        int i = TD2.a;
        if (i >= 23) {
            cVar = new c();
        } else {
            cVar = null;
        }
        this.d = cVar;
        if (i >= 21) {
            eVar = new e();
        } else {
            eVar = null;
        }
        this.e = eVar;
        Uri g = C10764xg.g();
        this.f = g != null ? new d(E, applicationContext.getContentResolver(), g) : null;
    }

    public final void c(C10764xg c10764xg) {
        if (this.h && !c10764xg.equals(this.g)) {
            this.g = c10764xg;
            this.b.a(c10764xg);
        }
    }

    public C10764xg d() {
        c cVar;
        if (this.h) {
            return (C10764xg) C9542sf.g(this.g);
        }
        this.h = true;
        d dVar = this.f;
        if (dVar != null) {
            dVar.a();
        }
        if (TD2.a >= 23 && (cVar = this.d) != null) {
            b.a(this.a, cVar, this.c);
        }
        Intent intent = null;
        if (this.e != null) {
            intent = this.a.registerReceiver(this.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.c);
        }
        C10764xg d2 = C10764xg.d(this.a, intent);
        this.g = d2;
        return d2;
    }

    public void e() {
        c cVar;
        if (!this.h) {
            return;
        }
        this.g = null;
        if (TD2.a >= 23 && (cVar = this.d) != null) {
            b.b(this.a, cVar);
        }
        BroadcastReceiver broadcastReceiver = this.e;
        if (broadcastReceiver != null) {
            this.a.unregisterReceiver(broadcastReceiver);
        }
        d dVar = this.f;
        if (dVar != null) {
            dVar.b();
        }
        this.h = false;
    }
}
