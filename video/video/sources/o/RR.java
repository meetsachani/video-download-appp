package o;

import java.io.IOException;

/* loaded from: classes3.dex */
public class RR extends IOException {
    private static final long serialVersionUID = 1;
    public long X;
    public String Y;

    public RR() {
    }

    public String a() {
        return this.Y;
    }

    public long b() {
        return this.X;
    }

    public RR(String str, long j, String str2) {
        super(str);
        this.X = j;
        this.Y = str2;
    }
}
