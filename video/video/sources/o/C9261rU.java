package o;

import java.io.File;
import o.Y30;

/* renamed from: o.rU  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9261rU<DataType> implements Y30.b {
    public final InterfaceC2422Ab0<DataType> a;
    public final DataType b;
    public final C5448bw1 c;

    public C9261rU(InterfaceC2422Ab0<DataType> interfaceC2422Ab0, DataType datatype, C5448bw1 c5448bw1) {
        this.a = interfaceC2422Ab0;
        this.b = datatype;
        this.c = c5448bw1;
    }

    @Override // o.Y30.b
    public boolean a(File file) {
        return this.a.b(this.b, file, this.c);
    }
}
