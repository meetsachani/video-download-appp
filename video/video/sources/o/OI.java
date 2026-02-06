package o;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;

/* loaded from: classes4.dex */
public class OI extends Format {
    private static final long serialVersionUID = -4329119827877627683L;
    public final Format X;
    public final Format Y;

    public OI(Format format, Format format2) {
        this.X = format;
        this.Y = format2;
    }

    public Format b() {
        return this.Y;
    }

    public Format c() {
        return this.X;
    }

    public String d(String str) throws ParseException {
        return format(parseObject(str));
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.Y.format(obj, stringBuffer, fieldPosition);
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.X.parseObject(str, parsePosition);
    }
}
