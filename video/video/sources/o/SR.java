package o;

import java.io.IOException;

/* loaded from: classes3.dex */
public class SR extends IOException {
    private static final long serialVersionUID = 1;
    public long X;
    public String Y;
    public int Z;

    public SR() {
    }

    public String a() {
        return this.Y;
    }

    public int b() {
        return this.Z;
    }

    public long c() {
        return this.X;
    }

    public SR(String str, long j, String str2, int i) {
        super(str);
        this.X = j;
        this.Y = str2;
        this.Z = i;
    }
}
