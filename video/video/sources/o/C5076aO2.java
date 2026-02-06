package o;

import java.io.IOException;

/* renamed from: o.aO2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5076aO2 extends IOException {
    private static final long serialVersionUID = 1;
    public final String X;
    public final String Y;
    public final String Y0;
    public final String Z;
    public final String Z0;

    public C5076aO2(String str, String str2, String str3, String str4) {
        this(str, null, null, str2, str3, str4);
    }

    public String a() {
        return this.X;
    }

    public String b() {
        return this.Z0;
    }

    public String c() {
        return this.Y0;
    }

    public String d() {
        return this.Z;
    }

    public String e() {
        return this.Y;
    }

    public C5076aO2(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str);
        this.Y0 = str2;
        this.Z0 = str3;
        this.X = str4;
        this.Y = str5;
        this.Z = str6;
    }
}
