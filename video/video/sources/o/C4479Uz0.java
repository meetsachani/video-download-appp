package o;

import java.util.UUID;

@Deprecated
/* renamed from: o.Uz0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4479Uz0 implements InterfaceC7280jR {
    public static final boolean d;
    public final UUID a;
    public final byte[] b;
    public final boolean c;

    static {
        boolean z;
        if ("Amazon".equals(TD2.c)) {
            String str = TD2.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                d = z;
            }
        }
        z = false;
        d = z;
    }

    public C4479Uz0(UUID uuid, byte[] bArr, boolean z) {
        this.a = uuid;
        this.b = bArr;
        this.c = z;
    }
}
