package o;

import java.net.URL;

/* renamed from: o.Fq0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C2983Fq0 implements XK0 {
    public final /* synthetic */ URL a;

    public /* synthetic */ C2983Fq0(URL url) {
        this.a = url;
    }

    @Override // o.XK0
    public final Object get() {
        return this.a.openStream();
    }
}
