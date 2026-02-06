package o;

import android.media.MediaCodec;

@Deprecated
/* renamed from: o.Ge1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3034Ge1 extends C9018qW {
    @InterfaceC11300zs1
    public final C3621Me1 X;
    @InterfaceC11300zs1
    public final String Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3034Ge1(Throwable th, @InterfaceC11300zs1 C3621Me1 c3621Me1) {
        super(r0.toString(), th);
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        if (c3621Me1 == null) {
            str = null;
        } else {
            str = c3621Me1.a;
        }
        sb.append(str);
        this.X = c3621Me1;
        this.Y = TD2.a >= 21 ? a(th) : null;
    }

    @InterfaceC11300zs1
    @ES1(21)
    public static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
