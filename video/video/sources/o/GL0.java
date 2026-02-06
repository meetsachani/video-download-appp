package o;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes2.dex */
public final class GL0 extends U72 {
    public static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
    public static final String d = "streamtitle";
    public static final String e = "streamurl";
    public final CharsetDecoder a = KB.c.newDecoder();
    public final CharsetDecoder b = KB.b.newDecoder();

    @Override // o.U72
    public C4224Si1 b(C5638cj1 c5638cj1, ByteBuffer byteBuffer) {
        String c2 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c2 == null) {
            return new C4224Si1(new IL0(bArr, null, null));
        }
        Matcher matcher = c.matcher(c2);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String g = C8077mf.g(group);
                g.getClass();
                if (!g.equals(e)) {
                    if (g.equals(d)) {
                        str = group2;
                    }
                } else {
                    str2 = group2;
                }
            }
        }
        return new C4224Si1(new IL0(bArr, str, str2));
    }

    @InterfaceC11300zs1
    public final String c(ByteBuffer byteBuffer) {
        try {
            return this.a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.b.decode(byteBuffer).toString();
                this.b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.a.reset();
            byteBuffer.rewind();
        }
    }
}
