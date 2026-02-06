package o;

import android.content.Intent;

/* renamed from: o.Rh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4118Rh extends C6524gJ2 {
    public Intent Z;

    public C4118Rh() {
    }

    public Intent c() {
        return this.Z;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.Z != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }

    public C4118Rh(Intent intent) {
        this.Z = intent;
    }

    public C4118Rh(C3470Kp1 c3470Kp1) {
        super(c3470Kp1);
    }

    public C4118Rh(String str) {
        super(str);
    }

    public C4118Rh(String str, Exception exc) {
        super(str, exc);
    }
}
