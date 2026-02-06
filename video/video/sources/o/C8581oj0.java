package o;

import java.io.ByteArrayOutputStream;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.oj0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8581oj0 extends ByteArrayOutputStream {
    public C8581oj0(int i) {
        super(i);
    }

    @NotNull
    public final byte[] a() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        C6562gT0.o(bArr, "buf");
        return bArr;
    }
}
