package o;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* renamed from: o.nC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8210nC extends FilterWriter {
    public static final int Y = 8192;
    public final int X;

    public C8210nC(Writer writer) {
        this(writer, 8192);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        C7743lL0.r(cArr, i, i2);
        while (i2 > 0) {
            int min = Math.min(i2, this.X);
            ((FilterWriter) this).out.write(cArr, i, min);
            i2 -= min;
            i += min;
        }
    }

    public C8210nC(Writer writer, int i) {
        super(writer);
        if (i > 0) {
            this.X = i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
