package org.jsoup;

import java.io.IOException;
import o.C6566gU0;

/* loaded from: classes4.dex */
public class HttpStatusException extends IOException {
    public final int X;
    public final String Y;

    public HttpStatusException(String str, int i, String str2) {
        super(str + ". Status=" + i + ", URL=[" + str2 + C6566gU0.g);
        this.X = i;
        this.Y = str2;
    }

    public int a() {
        return this.X;
    }

    public String b() {
        return this.Y;
    }
}
