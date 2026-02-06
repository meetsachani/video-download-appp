package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.parser.CharacterReader;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements CharacterReader.CharPredicate {
    @Override // org.jsoup.parser.CharacterReader.CharPredicate
    public final boolean a(char c) {
        return StringUtil.m(c);
    }
}
