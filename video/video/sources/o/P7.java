package o;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@Deprecated
/* loaded from: classes2.dex */
public class P7 implements FU {
    public final FU b;
    public final byte[] c;
    public final byte[] d;
    @InterfaceC11300zs1
    public CipherInputStream e;

    public P7(FU fu, byte[] bArr, byte[] bArr2) {
        this.b = fu;
        this.c = bArr;
        this.d = bArr2;
    }

    @Override // o.FU
    public final long a(OU ou) throws IOException {
        try {
            Cipher m = m();
            try {
                m.init(2, new SecretKeySpec(this.c, "AES"), new IvParameterSpec(this.d));
                MU mu = new MU(this.b, ou);
                this.e = new CipherInputStream(mu, m);
                mu.f();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // o.FU
    public final Map<String, List<String>> b() {
        return this.b.b();
    }

    @Override // o.FU
    public void close() throws IOException {
        if (this.e != null) {
            this.e = null;
            this.b.close();
        }
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public final Uri getUri() {
        return this.b.getUri();
    }

    public Cipher m() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // o.CU
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C9542sf.g(this.e);
        int read = this.e.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // o.FU
    public final void s(InterfaceC4261Sr2 interfaceC4261Sr2) {
        C9542sf.g(interfaceC4261Sr2);
        this.b.s(interfaceC4261Sr2);
    }
}
