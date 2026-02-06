package org.jsoup;

import java.io.IOException;

/* loaded from: classes4.dex */
public class UnsupportedMimeTypeException extends IOException {
    public final String X;
    public final String Y;

    public UnsupportedMimeTypeException(String str, String str2, String str3) {
        super(str);
        this.X = str2;
        this.Y = str3;
    }

    public String a() {
        return this.X;
    }

    public String b() {
        return this.Y;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Mimetype=" + this.X + ", URL=" + this.Y;
    }
}
