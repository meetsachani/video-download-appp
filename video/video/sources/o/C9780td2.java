package o;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.td2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9780td2 extends AbstractC10760xf<InputStream> {
    public C9780td2(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // o.InterfaceC9990uU
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // o.AbstractC10760xf
    /* renamed from: g */
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // o.AbstractC10760xf
    /* renamed from: h */
    public InputStream f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
