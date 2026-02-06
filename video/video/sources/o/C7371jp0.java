package o;

import java.io.File;
import java.io.IOException;

/* renamed from: o.jp0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7371jp0 extends IOException {
    private static final long serialVersionUID = 1;

    public C7371jp0() {
    }

    public C7371jp0(File file) {
        super("File " + file + " exists");
    }

    public C7371jp0(String str) {
        super(str);
    }
}
