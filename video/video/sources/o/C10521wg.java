package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

@Deprecated
/* renamed from: o.wg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10521wg {
    public final Context a;
    public final a b;
    public boolean c;

    /* renamed from: o.wg$a */
    /* loaded from: classes2.dex */
    public final class a extends BroadcastReceiver implements Runnable {
        public final b X;
        public final Handler Y;

        public a(Handler handler, b bVar) {
            this.Y = handler;
            this.X = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.Y.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C10521wg.this.c) {
                this.X.g();
            }
        }
    }

    /* renamed from: o.wg$b */
    /* loaded from: classes2.dex */
    public interface b {
        void g();
    }

    public C10521wg(Context context, Handler handler, b bVar) {
        this.a = context.getApplicationContext();
        this.b = new a(handler, bVar);
    }

    public void b(boolean z) {
        if (z && !this.c) {
            this.a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.c = true;
        } else if (!z && this.c) {
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}
