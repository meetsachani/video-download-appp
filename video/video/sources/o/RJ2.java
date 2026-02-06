package o;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes.dex */
public class RJ2 implements WebMessagePayloadBoundaryInterface {
    public final int X;
    public final String Y;
    public final byte[] Z;

    public RJ2(String str) {
        this.X = 0;
        this.Y = str;
        this.Z = null;
    }

    public final void a(int i) {
        if (this.X == i) {
            return;
        }
        throw new IllegalStateException("Expected " + i + ", but type is " + this.X);
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.Z;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public String getAsString() {
        a(0);
        return this.Y;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.X;
    }

    public RJ2(byte[] bArr) {
        this.X = 1;
        this.Y = null;
        this.Z = bArr;
    }
}
