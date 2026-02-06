package o;

import java.io.File;
import o.InterfaceC10771xh2;

/* loaded from: classes.dex */
public class DW1 implements InterfaceC10771xh2.c {
    public final String a;
    public final File b;
    public final InterfaceC10771xh2.c c;

    public DW1(String str, File file, InterfaceC10771xh2.c cVar) {
        this.a = str;
        this.b = file;
        this.c = cVar;
    }

    @Override // o.InterfaceC10771xh2.c
    public InterfaceC10771xh2 a(InterfaceC10771xh2.b bVar) {
        return new CW1(bVar.a, this.a, this.b, bVar.c.a, this.c.a(bVar));
    }
}
