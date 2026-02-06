package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* renamed from: o.bp0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5419bp0 extends AbstractC10760xf<AssetFileDescriptor> {
    public C5419bp0(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // o.InterfaceC9990uU
    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // o.AbstractC10760xf
    /* renamed from: g */
    public void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // o.AbstractC10760xf
    /* renamed from: h */
    public AssetFileDescriptor f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
