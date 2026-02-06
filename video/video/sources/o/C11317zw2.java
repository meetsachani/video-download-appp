package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: o.zw2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11317zw2 extends AbstractC3115Ha0 {
    public static Paint b1;
    public TextPaint a1;

    public C11317zw2(C11074yw2 c11074yw2) {
        super(c11074yw2);
    }

    public static Paint h() {
        if (b1 == null) {
            TextPaint textPaint = new TextPaint();
            b1 = textPaint;
            textPaint.setColor(androidx.emoji2.text.c.c().g());
            b1.setStyle(Paint.Style.FILL);
        }
        return b1;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint f2 = f(charSequence, i, i2, paint);
        if (f2 != null && f2.bgColor != 0) {
            g(canvas, f2, f, f + e(), i3, i5);
        }
        Paint paint2 = f2;
        if (androidx.emoji2.text.c.c().r()) {
            canvas.drawRect(f, i3, f + e(), i5, h());
        }
        C11074yw2 d = d();
        float f3 = i4;
        if (paint2 == null) {
            paint2 = paint;
        }
        d.a(canvas, f, f3, paint2);
    }

    public final TextPaint f(CharSequence charSequence, int i, int i2, Paint paint) {
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint = this.a1;
                    if (textPaint == null) {
                        textPaint = new TextPaint();
                        this.a1 = textPaint;
                    }
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                    return textPaint;
                }
            }
            if (!(paint instanceof TextPaint)) {
                return null;
            }
            return (TextPaint) paint;
        } else if (!(paint instanceof TextPaint)) {
            return null;
        } else {
            return (TextPaint) paint;
        }
    }

    public void g(Canvas canvas, TextPaint textPaint, float f, float f2, float f3, float f4) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f, f3, f2, f4, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }
}
