package o;

import android.content.Context;
import android.media.session.MediaSessionManager;
import o.C5630ch1;
import o.C7340jh1;

/* renamed from: o.ih1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7098ih1 extends C5873dh1 {
    public MediaSessionManager h;

    public C7098ih1(Context context) {
        super(context);
        this.h = (MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // o.C5873dh1, o.C7340jh1, o.C5630ch1.a
    public boolean a(C5630ch1.c cVar) {
        return super.a(cVar);
    }

    /* renamed from: o.ih1$a */
    /* loaded from: classes.dex */
    public static final class a extends C7340jh1.a {
        public final MediaSessionManager.RemoteUserInfo d;

        public a(String str, int i, int i2) {
            super(str, i, i2);
            this.d = C6856hh1.a(str, i, i2);
        }

        public static String c(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String packageName;
            packageName = remoteUserInfo.getPackageName();
            return packageName;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            super(r0, r1, r2);
            String packageName;
            int pid;
            int uid;
            packageName = remoteUserInfo.getPackageName();
            pid = remoteUserInfo.getPid();
            uid = remoteUserInfo.getUid();
            this.d = remoteUserInfo;
        }
    }
}
