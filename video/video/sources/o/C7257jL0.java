package o;

import java.io.InputStream;

/* renamed from: o.jL0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C7257jL0 implements InterfaceC5305bL0 {
    public final /* synthetic */ InputStream a;

    public /* synthetic */ C7257jL0(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // o.InterfaceC5305bL0
    public final Object b(Object obj, Object obj2, Object obj3) {
        return Integer.valueOf(this.a.read((byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
    }
}
