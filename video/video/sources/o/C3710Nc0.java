package o;

import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: o.Nc0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3710Nc0 {
    public static String a = "YTZY9YvNxMOrmlJfkvz7awixaYCTiLeKthaZtzh+MfZ9HK6wUuJ/lrMyptyWWA+I";
    public static final String b = "3d2a1c4b5f7e6a8d";
    public static final String c = "a8f5d1c7e9b34260";

    public static String a(String str) {
        Base64.Decoder decoder;
        byte[] decode;
        try {
            decoder = Base64.getDecoder();
            decode = decoder.decode(str);
            byte[] bArr = new byte[16];
            int length = decode.length - 16;
            byte[] bArr2 = new byte[length];
            System.arraycopy(decode, 0, bArr, 0, 16);
            System.arraycopy(decode, 16, bArr2, 0, length);
            SecretKeySpec c2 = c(c, b.getBytes());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, c2, new IvParameterSpec(bArr));
            return new String(cipher.doFinal(bArr2));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String b(String str) {
        Base64.Encoder encoder;
        String encodeToString;
        try {
            SecretKeySpec c2 = c(c, b.getBytes());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            cipher.init(1, c2, new IvParameterSpec(bArr));
            byte[] doFinal = cipher.doFinal(str.getBytes());
            byte[] bArr2 = new byte[doFinal.length + 16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            System.arraycopy(doFinal, 0, bArr2, 16, doFinal.length);
            encoder = Base64.getEncoder();
            encodeToString = encoder.encodeToString(bArr2);
            return encodeToString;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static SecretKeySpec c(String str, byte[] bArr) throws Exception {
        return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 65536, 256)).getEncoded(), "AES");
    }
}
