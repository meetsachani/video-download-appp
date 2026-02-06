package org.jsoup.parser;

import o.C2730De2;
import o.C8206nB;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.parser.Token;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public enum TokeniserState {
    Data { // from class: org.jsoup.parser.TokeniserState.1
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char P = characterReader.P();
            if (P != 0) {
                if (P != '&') {
                    if (P != '<') {
                        if (P != 65535) {
                            tokeniser.m(characterReader.u());
                            return;
                        } else {
                            tokeniser.n(new Token.EOF());
                            return;
                        }
                    }
                    tokeniser.a(TokeniserState.TagOpen);
                    return;
                }
                tokeniser.a(TokeniserState.CharacterReferenceInData);
                return;
            }
            tokeniser.v(this);
            tokeniser.l(characterReader.s());
        }
    },
    CharacterReferenceInData { // from class: org.jsoup.parser.TokeniserState.2
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.q(tokeniser, TokeniserState.Data);
        }
    },
    Rcdata { // from class: org.jsoup.parser.TokeniserState.3
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char P = characterReader.P();
            if (P != 0) {
                if (P != '&') {
                    if (P != '<') {
                        if (P != 65535) {
                            tokeniser.m(characterReader.u());
                            return;
                        } else {
                            tokeniser.n(new Token.EOF());
                            return;
                        }
                    }
                    tokeniser.a(TokeniserState.RcdataLessthanSign);
                    return;
                }
                tokeniser.a(TokeniserState.CharacterReferenceInRcdata);
                return;
            }
            tokeniser.v(this);
            characterReader.n();
            tokeniser.l((char) 65533);
        }
    },
    CharacterReferenceInRcdata { // from class: org.jsoup.parser.TokeniserState.4
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.q(tokeniser, TokeniserState.Rcdata);
        }
    },
    Rawtext { // from class: org.jsoup.parser.TokeniserState.5
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.s(tokeniser, characterReader, this, TokeniserState.RawtextLessthanSign);
        }
    },
    ScriptData { // from class: org.jsoup.parser.TokeniserState.6
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.s(tokeniser, characterReader, this, TokeniserState.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT { // from class: org.jsoup.parser.TokeniserState.7
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char P = characterReader.P();
            if (P != 0) {
                if (P != 65535) {
                    tokeniser.m(characterReader.G((char) 0));
                    return;
                } else {
                    tokeniser.n(new Token.EOF());
                    return;
                }
            }
            tokeniser.v(this);
            characterReader.n();
            tokeniser.l((char) 65533);
        }
    },
    TagOpen { // from class: org.jsoup.parser.TokeniserState.8
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char P = characterReader.P();
            if (P != '!') {
                if (P != '/') {
                    if (P != '?') {
                        if (characterReader.j0()) {
                            tokeniser.i(true);
                            tokeniser.y(TokeniserState.TagName);
                            return;
                        }
                        tokeniser.v(this);
                        tokeniser.l('<');
                        tokeniser.y(TokeniserState.Data);
                        return;
                    } else if (tokeniser.g == Document.OutputSettings.Syntax.xml) {
                        tokeniser.a(TokeniserState.MarkupProcessingOpen);
                        return;
                    } else {
                        tokeniser.f();
                        tokeniser.y(TokeniserState.BogusComment);
                        return;
                    }
                }
                tokeniser.a(TokeniserState.EndTagOpen);
                return;
            }
            tokeniser.a(TokeniserState.MarkupDeclarationOpen);
        }
    },
    EndTagOpen { // from class: org.jsoup.parser.TokeniserState.9
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.R()) {
                tokeniser.s(this);
                tokeniser.m("</");
                tokeniser.y(TokeniserState.Data);
            } else if (characterReader.j0()) {
                tokeniser.i(false);
                tokeniser.y(TokeniserState.TagName);
            } else if (characterReader.c0('>')) {
                tokeniser.v(this);
                tokeniser.a(TokeniserState.Data);
            } else {
                tokeniser.v(this);
                tokeniser.f();
                tokeniser.m.t('/');
                tokeniser.y(TokeniserState.BogusComment);
            }
        }
    },
    TagName { // from class: org.jsoup.parser.TokeniserState.10
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.j.z(characterReader.F());
            char s = characterReader.s();
            if (s != 0) {
                if (s != ' ') {
                    if (s != '/') {
                        if (s != '>') {
                            if (s != 65535) {
                                if (s != '\t' && s != '\n' && s != '\f' && s != '\r') {
                                    tokeniser.j.y(s);
                                    return;
                                }
                            } else {
                                tokeniser.s(this);
                                tokeniser.y(TokeniserState.Data);
                                return;
                            }
                        } else {
                            tokeniser.r();
                            tokeniser.y(TokeniserState.Data);
                            return;
                        }
                    } else {
                        tokeniser.y(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                }
                tokeniser.y(TokeniserState.BeforeAttributeName);
                return;
            }
            tokeniser.j.z(TokeniserState.p2);
        }
    },
    RcdataLessthanSign { // from class: org.jsoup.parser.TokeniserState.11
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.c0('/')) {
                tokeniser.j();
                tokeniser.a(TokeniserState.RCDATAEndTagOpen);
            } else if (characterReader.y0() && characterReader.j0() && tokeniser.b() != null && !characterReader.O(tokeniser.c())) {
                tokeniser.j = tokeniser.i(false).H(tokeniser.b());
                tokeniser.r();
                tokeniser.y(TokeniserState.TagOpen);
            } else {
                tokeniser.l('<');
                tokeniser.y(TokeniserState.Rcdata);
            }
        }
    },
    RCDATAEndTagOpen { // from class: org.jsoup.parser.TokeniserState.12
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.j0()) {
                tokeniser.i(false);
                tokeniser.j.y(characterReader.P());
                tokeniser.f.a(characterReader.P());
                tokeniser.a(TokeniserState.RCDATAEndTagName);
                return;
            }
            tokeniser.m("</");
            tokeniser.y(TokeniserState.Rcdata);
        }
    },
    RCDATAEndTagName { // from class: org.jsoup.parser.TokeniserState.13
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.j0()) {
                String F = characterReader.F();
                tokeniser.j.z(F);
                tokeniser.f.b(F);
                return;
            }
            char s = characterReader.s();
            if (s != '\t' && s != '\n' && s != '\f' && s != '\r' && s != ' ') {
                if (s != '/') {
                    if (s != '>') {
                        t(tokeniser, characterReader);
                    } else if (tokeniser.w()) {
                        tokeniser.r();
                        tokeniser.y(TokeniserState.Data);
                    } else {
                        t(tokeniser, characterReader);
                    }
                } else if (tokeniser.w()) {
                    tokeniser.y(TokeniserState.SelfClosingStartTag);
                } else {
                    t(tokeniser, characterReader);
                }
            } else if (tokeniser.w()) {
                tokeniser.y(TokeniserState.BeforeAttributeName);
            } else {
                t(tokeniser, characterReader);
            }
        }

        public final void t(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.m("</");
            tokeniser.m(tokeniser.f.h());
            characterReader.D0();
            tokeniser.y(TokeniserState.Rcdata);
        }
    },
    RawtextLessthanSign { // from class: org.jsoup.parser.TokeniserState.14
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.c0('/')) {
                tokeniser.j();
                tokeniser.a(TokeniserState.RawtextEndTagOpen);
                return;
            }
            tokeniser.l('<');
            tokeniser.y(TokeniserState.Rawtext);
        }
    },
    RawtextEndTagOpen { // from class: org.jsoup.parser.TokeniserState.15
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.r(tokeniser, characterReader, TokeniserState.RawtextEndTagName, TokeniserState.Rawtext);
        }
    },
    RawtextEndTagName { // from class: org.jsoup.parser.TokeniserState.16
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.o(tokeniser, characterReader, TokeniserState.Rawtext);
        }
    },
    ScriptDataLessthanSign { // from class: org.jsoup.parser.TokeniserState.17
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != '!') {
                if (s != '/') {
                    if (s != 65535) {
                        tokeniser.l('<');
                        characterReader.D0();
                        tokeniser.y(TokeniserState.ScriptData);
                        return;
                    }
                    tokeniser.l('<');
                    tokeniser.s(this);
                    tokeniser.y(TokeniserState.Data);
                    return;
                }
                tokeniser.j();
                tokeniser.y(TokeniserState.ScriptDataEndTagOpen);
                return;
            }
            tokeniser.m("<!");
            tokeniser.y(TokeniserState.ScriptDataEscapeStart);
        }
    },
    ScriptDataEndTagOpen { // from class: org.jsoup.parser.TokeniserState.18
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.r(tokeniser, characterReader, TokeniserState.ScriptDataEndTagName, TokeniserState.ScriptData);
        }
    },
    ScriptDataEndTagName { // from class: org.jsoup.parser.TokeniserState.19
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.o(tokeniser, characterReader, TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStart { // from class: org.jsoup.parser.TokeniserState.20
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.c0('-')) {
                tokeniser.l('-');
                tokeniser.a(TokeniserState.ScriptDataEscapeStartDash);
                return;
            }
            tokeniser.y(TokeniserState.ScriptData);
        }
    },
    ScriptDataEscapeStartDash { // from class: org.jsoup.parser.TokeniserState.21
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.c0('-')) {
                tokeniser.l('-');
                tokeniser.a(TokeniserState.ScriptDataEscapedDashDash);
                return;
            }
            tokeniser.y(TokeniserState.ScriptData);
        }
    },
    ScriptDataEscaped { // from class: org.jsoup.parser.TokeniserState.22
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.R()) {
                tokeniser.s(this);
                tokeniser.y(TokeniserState.Data);
                return;
            }
            char P = characterReader.P();
            if (P != 0) {
                if (P != '-') {
                    if (P != '<') {
                        tokeniser.m(characterReader.I('-', '<', 0));
                        return;
                    } else {
                        tokeniser.a(TokeniserState.ScriptDataEscapedLessthanSign);
                        return;
                    }
                }
                tokeniser.l('-');
                tokeniser.a(TokeniserState.ScriptDataEscapedDash);
                return;
            }
            tokeniser.v(this);
            characterReader.n();
            tokeniser.l((char) 65533);
        }
    },
    ScriptDataEscapedDash { // from class: org.jsoup.parser.TokeniserState.23
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.R()) {
                tokeniser.s(this);
                tokeniser.y(TokeniserState.Data);
                return;
            }
            char s = characterReader.s();
            if (s != 0) {
                if (s != '-') {
                    if (s != '<') {
                        tokeniser.l(s);
                        tokeniser.y(TokeniserState.ScriptDataEscaped);
                        return;
                    }
                    tokeniser.y(TokeniserState.ScriptDataEscapedLessthanSign);
                    return;
                }
                tokeniser.l(s);
                tokeniser.y(TokeniserState.ScriptDataEscapedDashDash);
                return;
            }
            tokeniser.v(this);
            tokeniser.l((char) 65533);
            tokeniser.y(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.24
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.R()) {
                tokeniser.s(this);
                tokeniser.y(TokeniserState.Data);
                return;
            }
            char s = characterReader.s();
            if (s != 0) {
                if (s != '-') {
                    if (s != '<') {
                        if (s != '>') {
                            tokeniser.l(s);
                            tokeniser.y(TokeniserState.ScriptDataEscaped);
                            return;
                        }
                        tokeniser.l(s);
                        tokeniser.y(TokeniserState.ScriptData);
                        return;
                    }
                    tokeniser.y(TokeniserState.ScriptDataEscapedLessthanSign);
                    return;
                }
                tokeniser.l(s);
                return;
            }
            tokeniser.v(this);
            tokeniser.l((char) 65533);
            tokeniser.y(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.25
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.j0()) {
                tokeniser.j();
                tokeniser.f.a(characterReader.P());
                tokeniser.l('<');
                tokeniser.l(characterReader.P());
                tokeniser.a(TokeniserState.ScriptDataDoubleEscapeStart);
            } else if (characterReader.c0('/')) {
                tokeniser.j();
                tokeniser.a(TokeniserState.ScriptDataEscapedEndTagOpen);
            } else {
                tokeniser.l('<');
                tokeniser.y(TokeniserState.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedEndTagOpen { // from class: org.jsoup.parser.TokeniserState.26
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.j0()) {
                tokeniser.i(false);
                tokeniser.j.y(characterReader.P());
                tokeniser.f.a(characterReader.P());
                tokeniser.a(TokeniserState.ScriptDataEscapedEndTagName);
                return;
            }
            tokeniser.m("</");
            tokeniser.y(TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName { // from class: org.jsoup.parser.TokeniserState.27
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.o(tokeniser, characterReader, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart { // from class: org.jsoup.parser.TokeniserState.28
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.n(tokeniser, characterReader, TokeniserState.ScriptDataDoubleEscaped, TokeniserState.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped { // from class: org.jsoup.parser.TokeniserState.29
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char P = characterReader.P();
            if (P != 0) {
                if (P != '-') {
                    if (P != '<') {
                        if (P != 65535) {
                            tokeniser.m(characterReader.I('-', '<', 0));
                            return;
                        }
                        tokeniser.s(this);
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.l(P);
                    tokeniser.a(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    return;
                }
                tokeniser.l(P);
                tokeniser.a(TokeniserState.ScriptDataDoubleEscapedDash);
                return;
            }
            tokeniser.v(this);
            characterReader.n();
            tokeniser.l((char) 65533);
        }
    },
    ScriptDataDoubleEscapedDash { // from class: org.jsoup.parser.TokeniserState.30
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != '-') {
                    if (s != '<') {
                        if (s != 65535) {
                            tokeniser.l(s);
                            tokeniser.y(TokeniserState.ScriptDataDoubleEscaped);
                            return;
                        }
                        tokeniser.s(this);
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.l(s);
                    tokeniser.y(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    return;
                }
                tokeniser.l(s);
                tokeniser.y(TokeniserState.ScriptDataDoubleEscapedDashDash);
                return;
            }
            tokeniser.v(this);
            tokeniser.l((char) 65533);
            tokeniser.y(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapedDashDash { // from class: org.jsoup.parser.TokeniserState.31
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != '-') {
                    if (s != '<') {
                        if (s != '>') {
                            if (s != 65535) {
                                tokeniser.l(s);
                                tokeniser.y(TokeniserState.ScriptDataDoubleEscaped);
                                return;
                            }
                            tokeniser.s(this);
                            tokeniser.y(TokeniserState.Data);
                            return;
                        }
                        tokeniser.l(s);
                        tokeniser.y(TokeniserState.ScriptData);
                        return;
                    }
                    tokeniser.l(s);
                    tokeniser.y(TokeniserState.ScriptDataDoubleEscapedLessthanSign);
                    return;
                }
                tokeniser.l(s);
                return;
            }
            tokeniser.v(this);
            tokeniser.l((char) 65533);
            tokeniser.y(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapedLessthanSign { // from class: org.jsoup.parser.TokeniserState.32
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.c0('/')) {
                tokeniser.l('/');
                tokeniser.j();
                tokeniser.a(TokeniserState.ScriptDataDoubleEscapeEnd);
                return;
            }
            tokeniser.y(TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd { // from class: org.jsoup.parser.TokeniserState.33
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            TokeniserState.n(tokeniser, characterReader, TokeniserState.ScriptDataEscaped, TokeniserState.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName { // from class: org.jsoup.parser.TokeniserState.34
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != ' ') {
                    if (s != '\"' && s != '\'') {
                        if (s != '/') {
                            if (s != 65535) {
                                if (s != '\t' && s != '\n' && s != '\f' && s != '\r') {
                                    switch (s) {
                                        case '=':
                                            break;
                                        case '>':
                                            tokeniser.r();
                                            tokeniser.y(TokeniserState.Data);
                                            return;
                                        case '?':
                                            if (tokeniser.j instanceof Token.XmlDecl) {
                                                return;
                                            }
                                            tokeniser.j.I();
                                            characterReader.D0();
                                            tokeniser.y(TokeniserState.AttributeName);
                                            return;
                                        default:
                                            tokeniser.j.I();
                                            characterReader.D0();
                                            tokeniser.y(TokeniserState.AttributeName);
                                            return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                tokeniser.s(this);
                                tokeniser.y(TokeniserState.Data);
                                return;
                            }
                        } else {
                            tokeniser.y(TokeniserState.SelfClosingStartTag);
                            return;
                        }
                    }
                    tokeniser.v(this);
                    tokeniser.j.I();
                    tokeniser.j.t(s, characterReader.p0() - 1, characterReader.p0());
                    tokeniser.y(TokeniserState.AttributeName);
                    return;
                }
                return;
            }
            characterReader.D0();
            tokeniser.v(this);
            tokeniser.j.I();
            tokeniser.y(TokeniserState.AttributeName);
        }
    },
    AttributeName { // from class: org.jsoup.parser.TokeniserState.35
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            int p0 = characterReader.p0();
            tokeniser.j.u(characterReader.M(TokeniserState.m2), p0, characterReader.p0());
            int p02 = characterReader.p0();
            char s = characterReader.s();
            if (s != '\t' && s != '\n' && s != '\f' && s != '\r' && s != ' ') {
                if (s != '\"' && s != '\'') {
                    if (s != '/') {
                        if (s != 65535) {
                            switch (s) {
                                case '<':
                                    break;
                                case '=':
                                    tokeniser.y(TokeniserState.BeforeAttributeValue);
                                    return;
                                case '>':
                                    tokeniser.r();
                                    tokeniser.y(TokeniserState.Data);
                                    return;
                                case '?':
                                    if (tokeniser.g == Document.OutputSettings.Syntax.xml && (tokeniser.j instanceof Token.XmlDecl)) {
                                        tokeniser.y(TokeniserState.AfterAttributeName);
                                        return;
                                    }
                                    tokeniser.j.t(s, p02, characterReader.p0());
                                    return;
                                default:
                                    tokeniser.j.t(s, p02, characterReader.p0());
                                    return;
                            }
                        } else {
                            tokeniser.s(this);
                            tokeniser.y(TokeniserState.Data);
                            return;
                        }
                    } else {
                        tokeniser.y(TokeniserState.SelfClosingStartTag);
                        return;
                    }
                }
                tokeniser.v(this);
                tokeniser.j.t(s, p02, characterReader.p0());
                return;
            }
            tokeniser.y(TokeniserState.AfterAttributeName);
        }
    },
    AfterAttributeName { // from class: org.jsoup.parser.TokeniserState.36
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != ' ') {
                    if (s != '\"' && s != '\'') {
                        if (s != '/') {
                            if (s != 65535) {
                                if (s != '\t' && s != '\n' && s != '\f' && s != '\r') {
                                    switch (s) {
                                        case '<':
                                            break;
                                        case '=':
                                            tokeniser.y(TokeniserState.BeforeAttributeValue);
                                            return;
                                        case '>':
                                            tokeniser.r();
                                            tokeniser.y(TokeniserState.Data);
                                            return;
                                        default:
                                            tokeniser.j.I();
                                            characterReader.D0();
                                            tokeniser.y(TokeniserState.AttributeName);
                                            return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                tokeniser.s(this);
                                tokeniser.y(TokeniserState.Data);
                                return;
                            }
                        } else {
                            tokeniser.y(TokeniserState.SelfClosingStartTag);
                            return;
                        }
                    }
                    tokeniser.v(this);
                    tokeniser.j.I();
                    tokeniser.j.t(s, characterReader.p0() - 1, characterReader.p0());
                    tokeniser.y(TokeniserState.AttributeName);
                    return;
                }
                return;
            }
            tokeniser.v(this);
            tokeniser.j.t((char) 65533, characterReader.p0() - 1, characterReader.p0());
            tokeniser.y(TokeniserState.AttributeName);
        }
    },
    BeforeAttributeValue { // from class: org.jsoup.parser.TokeniserState.37
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != ' ') {
                    if (s != '\"') {
                        if (s != '`') {
                            if (s != 65535) {
                                if (s != '\t' && s != '\n' && s != '\f' && s != '\r') {
                                    if (s != '&') {
                                        if (s != '\'') {
                                            switch (s) {
                                                case '<':
                                                case '=':
                                                    break;
                                                case '>':
                                                    tokeniser.v(this);
                                                    tokeniser.r();
                                                    tokeniser.y(TokeniserState.Data);
                                                    return;
                                                default:
                                                    characterReader.D0();
                                                    tokeniser.y(TokeniserState.AttributeValue_unquoted);
                                                    return;
                                            }
                                        } else {
                                            tokeniser.y(TokeniserState.AttributeValue_singleQuoted);
                                            return;
                                        }
                                    } else {
                                        characterReader.D0();
                                        tokeniser.y(TokeniserState.AttributeValue_unquoted);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                tokeniser.s(this);
                                tokeniser.r();
                                tokeniser.y(TokeniserState.Data);
                                return;
                            }
                        }
                        tokeniser.v(this);
                        tokeniser.j.v(s, characterReader.p0() - 1, characterReader.p0());
                        tokeniser.y(TokeniserState.AttributeValue_unquoted);
                        return;
                    }
                    tokeniser.y(TokeniserState.AttributeValue_doubleQuoted);
                    return;
                }
                return;
            }
            tokeniser.v(this);
            tokeniser.j.v((char) 65533, characterReader.p0() - 1, characterReader.p0());
            tokeniser.y(TokeniserState.AttributeValue_unquoted);
        }
    },
    AttributeValue_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.38
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            int p0 = characterReader.p0();
            String t = characterReader.t(false);
            if (t.length() > 0) {
                tokeniser.j.w(t, p0, characterReader.p0());
            } else {
                tokeniser.j.M();
            }
            int p02 = characterReader.p0();
            char s = characterReader.s();
            if (s != 0) {
                if (s != '\"') {
                    if (s != '&') {
                        if (s != 65535) {
                            tokeniser.j.v(s, p02, characterReader.p0());
                            return;
                        }
                        tokeniser.s(this);
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    int[] e = tokeniser.e('\"', true);
                    if (e != null) {
                        tokeniser.j.x(e, p02, characterReader.p0());
                        return;
                    } else {
                        tokeniser.j.v('&', p02, characterReader.p0());
                        return;
                    }
                }
                tokeniser.y(TokeniserState.AfterAttributeValue_quoted);
                return;
            }
            tokeniser.v(this);
            tokeniser.j.v((char) 65533, p02, characterReader.p0());
        }
    },
    AttributeValue_singleQuoted { // from class: org.jsoup.parser.TokeniserState.39
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            int p0 = characterReader.p0();
            String t = characterReader.t(true);
            if (t.length() > 0) {
                tokeniser.j.w(t, p0, characterReader.p0());
            } else {
                tokeniser.j.M();
            }
            int p02 = characterReader.p0();
            char s = characterReader.s();
            if (s != 0) {
                if (s != 65535) {
                    if (s != '&') {
                        if (s != '\'') {
                            tokeniser.j.v(s, p02, characterReader.p0());
                            return;
                        } else {
                            tokeniser.y(TokeniserState.AfterAttributeValue_quoted);
                            return;
                        }
                    }
                    int[] e = tokeniser.e('\'', true);
                    if (e != null) {
                        tokeniser.j.x(e, p02, characterReader.p0());
                        return;
                    } else {
                        tokeniser.j.v('&', p02, characterReader.p0());
                        return;
                    }
                }
                tokeniser.s(this);
                tokeniser.y(TokeniserState.Data);
                return;
            }
            tokeniser.v(this);
            tokeniser.j.v((char) 65533, p02, characterReader.p0());
        }
    },
    AttributeValue_unquoted { // from class: org.jsoup.parser.TokeniserState.40
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            int p0 = characterReader.p0();
            String M = characterReader.M(TokeniserState.n2);
            if (M.length() > 0) {
                tokeniser.j.w(M, p0, characterReader.p0());
            }
            int p02 = characterReader.p0();
            char s = characterReader.s();
            if (s != 0) {
                if (s != ' ') {
                    if (s != '\"' && s != '`') {
                        if (s != 65535) {
                            if (s != '\t' && s != '\n' && s != '\f' && s != '\r') {
                                if (s != '&') {
                                    if (s != '\'') {
                                        switch (s) {
                                            case '<':
                                            case '=':
                                                break;
                                            case '>':
                                                tokeniser.r();
                                                tokeniser.y(TokeniserState.Data);
                                                return;
                                            default:
                                                tokeniser.j.v(s, p02, characterReader.p0());
                                                return;
                                        }
                                    }
                                } else {
                                    int[] e = tokeniser.e('>', true);
                                    if (e != null) {
                                        tokeniser.j.x(e, p02, characterReader.p0());
                                        return;
                                    } else {
                                        tokeniser.j.v('&', p02, characterReader.p0());
                                        return;
                                    }
                                }
                            }
                        } else {
                            tokeniser.s(this);
                            tokeniser.y(TokeniserState.Data);
                            return;
                        }
                    }
                    tokeniser.v(this);
                    tokeniser.j.v(s, p02, characterReader.p0());
                    return;
                }
                tokeniser.y(TokeniserState.BeforeAttributeName);
                return;
            }
            tokeniser.v(this);
            tokeniser.j.v((char) 65533, p02, characterReader.p0());
        }
    },
    AfterAttributeValue_quoted { // from class: org.jsoup.parser.TokeniserState.41
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != '\t' && s != '\n' && s != '\f' && s != '\r' && s != ' ') {
                if (s != '/') {
                    if (s != 65535) {
                        if (s != '>') {
                            if (s == '?' && (tokeniser.j instanceof Token.XmlDecl)) {
                                return;
                            }
                            characterReader.D0();
                            tokeniser.v(this);
                            tokeniser.y(TokeniserState.BeforeAttributeName);
                            return;
                        }
                        tokeniser.r();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.s(this);
                    tokeniser.y(TokeniserState.Data);
                    return;
                }
                tokeniser.y(TokeniserState.SelfClosingStartTag);
                return;
            }
            tokeniser.y(TokeniserState.BeforeAttributeName);
        }
    },
    SelfClosingStartTag { // from class: org.jsoup.parser.TokeniserState.42
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != '>') {
                if (s != 65535) {
                    characterReader.D0();
                    tokeniser.v(this);
                    tokeniser.y(TokeniserState.BeforeAttributeName);
                    return;
                }
                tokeniser.s(this);
                tokeniser.y(TokeniserState.Data);
                return;
            }
            tokeniser.j.g = true;
            tokeniser.r();
            tokeniser.y(TokeniserState.Data);
        }
    },
    BogusComment { // from class: org.jsoup.parser.TokeniserState.43
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.m.u(characterReader.G('>'));
            char P = characterReader.P();
            if (P != '>' && P != 65535) {
                return;
            }
            characterReader.s();
            tokeniser.p();
            tokeniser.y(TokeniserState.Data);
        }
    },
    MarkupDeclarationOpen { // from class: org.jsoup.parser.TokeniserState.44
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.a0("--")) {
                tokeniser.g();
                tokeniser.y(TokeniserState.CommentStart);
            } else if (characterReader.b0("DOCTYPE")) {
                tokeniser.y(TokeniserState.Doctype);
            } else if (characterReader.a0("[CDATA[")) {
                tokeniser.j();
                tokeniser.y(TokeniserState.CdataSection);
            } else if (tokeniser.g == Document.OutputSettings.Syntax.xml && characterReader.j0()) {
                tokeniser.k(true);
                tokeniser.y(TokeniserState.TagName);
            } else {
                tokeniser.v(this);
                tokeniser.f();
                tokeniser.y(TokeniserState.BogusComment);
            }
        }
    },
    MarkupProcessingOpen { // from class: org.jsoup.parser.TokeniserState.45
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.j0()) {
                tokeniser.k(false);
                tokeniser.y(TokeniserState.TagName);
                return;
            }
            tokeniser.v(this);
            tokeniser.f();
            tokeniser.m.t('?');
            tokeniser.y(TokeniserState.BogusComment);
        }
    },
    CommentStart { // from class: org.jsoup.parser.TokeniserState.46
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != '-') {
                    if (s != '>') {
                        if (s != 65535) {
                            characterReader.D0();
                            tokeniser.y(TokeniserState.Comment);
                            return;
                        }
                        tokeniser.s(this);
                        tokeniser.p();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.v(this);
                    tokeniser.p();
                    tokeniser.y(TokeniserState.Data);
                    return;
                }
                tokeniser.y(TokeniserState.CommentStartDash);
                return;
            }
            tokeniser.v(this);
            tokeniser.m.t((char) 65533);
            tokeniser.y(TokeniserState.Comment);
        }
    },
    CommentStartDash { // from class: org.jsoup.parser.TokeniserState.47
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != '-') {
                    if (s != '>') {
                        if (s != 65535) {
                            tokeniser.m.t(s);
                            tokeniser.y(TokeniserState.Comment);
                            return;
                        }
                        tokeniser.s(this);
                        tokeniser.p();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.v(this);
                    tokeniser.p();
                    tokeniser.y(TokeniserState.Data);
                    return;
                }
                tokeniser.y(TokeniserState.CommentEnd);
                return;
            }
            tokeniser.v(this);
            tokeniser.m.t((char) 65533);
            tokeniser.y(TokeniserState.Comment);
        }
    },
    Comment { // from class: org.jsoup.parser.TokeniserState.48
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char P = characterReader.P();
            if (P != 0) {
                if (P != '-') {
                    if (P != 65535) {
                        tokeniser.m.u(characterReader.I('-', 0));
                        return;
                    }
                    tokeniser.s(this);
                    tokeniser.p();
                    tokeniser.y(TokeniserState.Data);
                    return;
                }
                tokeniser.a(TokeniserState.CommentEndDash);
                return;
            }
            tokeniser.v(this);
            characterReader.n();
            tokeniser.m.t((char) 65533);
        }
    },
    CommentEndDash { // from class: org.jsoup.parser.TokeniserState.49
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != '-') {
                    if (s != 65535) {
                        tokeniser.m.t('-').t(s);
                        tokeniser.y(TokeniserState.Comment);
                        return;
                    }
                    tokeniser.s(this);
                    tokeniser.p();
                    tokeniser.y(TokeniserState.Data);
                    return;
                }
                tokeniser.y(TokeniserState.CommentEnd);
                return;
            }
            tokeniser.v(this);
            tokeniser.m.t('-').t((char) 65533);
            tokeniser.y(TokeniserState.Comment);
        }
    },
    CommentEnd { // from class: org.jsoup.parser.TokeniserState.50
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != '!') {
                    if (s != '-') {
                        if (s != '>') {
                            if (s != 65535) {
                                tokeniser.m.u("--").t(s);
                                tokeniser.y(TokeniserState.Comment);
                                return;
                            }
                            tokeniser.s(this);
                            tokeniser.p();
                            tokeniser.y(TokeniserState.Data);
                            return;
                        }
                        tokeniser.p();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.m.t('-');
                    return;
                }
                tokeniser.y(TokeniserState.CommentEndBang);
                return;
            }
            tokeniser.v(this);
            tokeniser.m.u("--").t((char) 65533);
            tokeniser.y(TokeniserState.Comment);
        }
    },
    CommentEndBang { // from class: org.jsoup.parser.TokeniserState.51
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != '-') {
                    if (s != '>') {
                        if (s != 65535) {
                            tokeniser.m.u("--!").t(s);
                            tokeniser.y(TokeniserState.Comment);
                            return;
                        }
                        tokeniser.s(this);
                        tokeniser.p();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.p();
                    tokeniser.y(TokeniserState.Data);
                    return;
                }
                tokeniser.m.u("--!");
                tokeniser.y(TokeniserState.CommentEndDash);
                return;
            }
            tokeniser.v(this);
            tokeniser.m.u("--!").t((char) 65533);
            tokeniser.y(TokeniserState.Comment);
        }
    },
    Doctype { // from class: org.jsoup.parser.TokeniserState.52
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != '\t' && s != '\n' && s != '\f' && s != '\r' && s != ' ') {
                if (s != '>') {
                    if (s != 65535) {
                        tokeniser.v(this);
                        tokeniser.y(TokeniserState.BeforeDoctypeName);
                        return;
                    }
                    tokeniser.s(this);
                }
                tokeniser.v(this);
                tokeniser.h();
                tokeniser.l.i = true;
                tokeniser.q();
                tokeniser.y(TokeniserState.Data);
                return;
            }
            tokeniser.y(TokeniserState.BeforeDoctypeName);
        }
    },
    BeforeDoctypeName { // from class: org.jsoup.parser.TokeniserState.53
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.j0()) {
                tokeniser.h();
                tokeniser.y(TokeniserState.DoctypeName);
                return;
            }
            char s = characterReader.s();
            if (s != 0) {
                if (s != ' ') {
                    if (s != 65535) {
                        if (s != '\t' && s != '\n' && s != '\f' && s != '\r') {
                            tokeniser.h();
                            tokeniser.l.e.a(s);
                            tokeniser.y(TokeniserState.DoctypeName);
                            return;
                        }
                        return;
                    }
                    tokeniser.s(this);
                    tokeniser.h();
                    tokeniser.l.i = true;
                    tokeniser.q();
                    tokeniser.y(TokeniserState.Data);
                    return;
                }
                return;
            }
            tokeniser.v(this);
            tokeniser.h();
            tokeniser.l.e.a((char) 65533);
            tokeniser.y(TokeniserState.DoctypeName);
        }
    },
    DoctypeName { // from class: org.jsoup.parser.TokeniserState.54
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.j0()) {
                tokeniser.l.e.b(characterReader.y());
                return;
            }
            char s = characterReader.s();
            if (s != 0) {
                if (s != ' ') {
                    if (s != '>') {
                        if (s != 65535) {
                            if (s != '\t' && s != '\n' && s != '\f' && s != '\r') {
                                tokeniser.l.e.a(s);
                                return;
                            }
                        } else {
                            tokeniser.s(this);
                            tokeniser.l.i = true;
                            tokeniser.q();
                            tokeniser.y(TokeniserState.Data);
                            return;
                        }
                    } else {
                        tokeniser.q();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                }
                tokeniser.y(TokeniserState.AfterDoctypeName);
                return;
            }
            tokeniser.v(this);
            tokeniser.l.e.a((char) 65533);
        }
    },
    AfterDoctypeName { // from class: org.jsoup.parser.TokeniserState.55
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            if (characterReader.R()) {
                tokeniser.s(this);
                tokeniser.l.i = true;
                tokeniser.q();
                tokeniser.y(TokeniserState.Data);
            } else if (characterReader.g0('\t', '\n', C8206nB.d, '\f', ' ')) {
                characterReader.n();
            } else if (characterReader.c0('>')) {
                tokeniser.q();
                tokeniser.a(TokeniserState.Data);
            } else if (characterReader.b0(DocumentType.b1)) {
                tokeniser.l.f = DocumentType.b1;
                tokeniser.y(TokeniserState.AfterDoctypePublicKeyword);
            } else if (characterReader.b0(DocumentType.c1)) {
                tokeniser.l.f = DocumentType.c1;
                tokeniser.y(TokeniserState.AfterDoctypeSystemKeyword);
            } else {
                tokeniser.v(this);
                tokeniser.l.i = true;
                tokeniser.a(TokeniserState.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword { // from class: org.jsoup.parser.TokeniserState.56
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != '\t' && s != '\n' && s != '\f' && s != '\r' && s != ' ') {
                if (s != '\"') {
                    if (s != '\'') {
                        if (s != '>') {
                            if (s != 65535) {
                                tokeniser.v(this);
                                tokeniser.l.i = true;
                                tokeniser.y(TokeniserState.BogusDoctype);
                                return;
                            }
                            tokeniser.s(this);
                            tokeniser.l.i = true;
                            tokeniser.q();
                            tokeniser.y(TokeniserState.Data);
                            return;
                        }
                        tokeniser.v(this);
                        tokeniser.l.i = true;
                        tokeniser.q();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.v(this);
                    tokeniser.y(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                    return;
                }
                tokeniser.v(this);
                tokeniser.y(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
                return;
            }
            tokeniser.y(TokeniserState.BeforeDoctypePublicIdentifier);
        }
    },
    BeforeDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.57
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != '\t' && s != '\n' && s != '\f' && s != '\r' && s != ' ') {
                if (s != '\"') {
                    if (s != '\'') {
                        if (s != '>') {
                            if (s != 65535) {
                                tokeniser.v(this);
                                tokeniser.l.i = true;
                                tokeniser.y(TokeniserState.BogusDoctype);
                                return;
                            }
                            tokeniser.s(this);
                            tokeniser.l.i = true;
                            tokeniser.q();
                            tokeniser.y(TokeniserState.Data);
                            return;
                        }
                        tokeniser.v(this);
                        tokeniser.l.i = true;
                        tokeniser.q();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.y(TokeniserState.DoctypePublicIdentifier_singleQuoted);
                    return;
                }
                tokeniser.y(TokeniserState.DoctypePublicIdentifier_doubleQuoted);
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.58
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != '\"') {
                    if (s != '>') {
                        if (s != 65535) {
                            tokeniser.l.g.a(s);
                            return;
                        }
                        tokeniser.s(this);
                        tokeniser.l.i = true;
                        tokeniser.q();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.v(this);
                    tokeniser.l.i = true;
                    tokeniser.q();
                    tokeniser.y(TokeniserState.Data);
                    return;
                }
                tokeniser.y(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            tokeniser.v(this);
            tokeniser.l.g.a((char) 65533);
        }
    },
    DoctypePublicIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.59
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != '\'') {
                    if (s != '>') {
                        if (s != 65535) {
                            tokeniser.l.g.a(s);
                            return;
                        }
                        tokeniser.s(this);
                        tokeniser.l.i = true;
                        tokeniser.q();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.v(this);
                    tokeniser.l.i = true;
                    tokeniser.q();
                    tokeniser.y(TokeniserState.Data);
                    return;
                }
                tokeniser.y(TokeniserState.AfterDoctypePublicIdentifier);
                return;
            }
            tokeniser.v(this);
            tokeniser.l.g.a((char) 65533);
        }
    },
    AfterDoctypePublicIdentifier { // from class: org.jsoup.parser.TokeniserState.60
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != '\t' && s != '\n' && s != '\f' && s != '\r' && s != ' ') {
                if (s != '\"') {
                    if (s != '\'') {
                        if (s != '>') {
                            if (s != 65535) {
                                tokeniser.v(this);
                                tokeniser.l.i = true;
                                tokeniser.y(TokeniserState.BogusDoctype);
                                return;
                            }
                            tokeniser.s(this);
                            tokeniser.l.i = true;
                            tokeniser.q();
                            tokeniser.y(TokeniserState.Data);
                            return;
                        }
                        tokeniser.q();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.v(this);
                    tokeniser.y(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                tokeniser.v(this);
                tokeniser.y(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            tokeniser.y(TokeniserState.BetweenDoctypePublicAndSystemIdentifiers);
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers { // from class: org.jsoup.parser.TokeniserState.61
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != '\t' && s != '\n' && s != '\f' && s != '\r' && s != ' ') {
                if (s != '\"') {
                    if (s != '\'') {
                        if (s != '>') {
                            if (s != 65535) {
                                tokeniser.v(this);
                                tokeniser.l.i = true;
                                tokeniser.y(TokeniserState.BogusDoctype);
                                return;
                            }
                            tokeniser.s(this);
                            tokeniser.l.i = true;
                            tokeniser.q();
                            tokeniser.y(TokeniserState.Data);
                            return;
                        }
                        tokeniser.q();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.v(this);
                    tokeniser.y(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                tokeniser.v(this);
                tokeniser.y(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
            }
        }
    },
    AfterDoctypeSystemKeyword { // from class: org.jsoup.parser.TokeniserState.62
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != '\t' && s != '\n' && s != '\f' && s != '\r' && s != ' ') {
                if (s != '\"') {
                    if (s != '\'') {
                        if (s != '>') {
                            if (s != 65535) {
                                tokeniser.v(this);
                                tokeniser.l.i = true;
                                tokeniser.q();
                                return;
                            }
                            tokeniser.s(this);
                            tokeniser.l.i = true;
                            tokeniser.q();
                            tokeniser.y(TokeniserState.Data);
                            return;
                        }
                        tokeniser.v(this);
                        tokeniser.l.i = true;
                        tokeniser.q();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.v(this);
                    tokeniser.y(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                tokeniser.v(this);
                tokeniser.y(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
                return;
            }
            tokeniser.y(TokeniserState.BeforeDoctypeSystemIdentifier);
        }
    },
    BeforeDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.63
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != '\t' && s != '\n' && s != '\f' && s != '\r' && s != ' ') {
                if (s != '\"') {
                    if (s != '\'') {
                        if (s != '>') {
                            if (s != 65535) {
                                tokeniser.v(this);
                                tokeniser.l.i = true;
                                tokeniser.y(TokeniserState.BogusDoctype);
                                return;
                            }
                            tokeniser.s(this);
                            tokeniser.l.i = true;
                            tokeniser.q();
                            tokeniser.y(TokeniserState.Data);
                            return;
                        }
                        tokeniser.v(this);
                        tokeniser.l.i = true;
                        tokeniser.q();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.y(TokeniserState.DoctypeSystemIdentifier_singleQuoted);
                    return;
                }
                tokeniser.y(TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted { // from class: org.jsoup.parser.TokeniserState.64
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != '\"') {
                    if (s != '>') {
                        if (s != 65535) {
                            tokeniser.l.h.a(s);
                            return;
                        }
                        tokeniser.s(this);
                        tokeniser.l.i = true;
                        tokeniser.q();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.v(this);
                    tokeniser.l.i = true;
                    tokeniser.q();
                    tokeniser.y(TokeniserState.Data);
                    return;
                }
                tokeniser.y(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            tokeniser.v(this);
            tokeniser.l.h.a((char) 65533);
        }
    },
    DoctypeSystemIdentifier_singleQuoted { // from class: org.jsoup.parser.TokeniserState.65
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != 0) {
                if (s != '\'') {
                    if (s != '>') {
                        if (s != 65535) {
                            tokeniser.l.h.a(s);
                            return;
                        }
                        tokeniser.s(this);
                        tokeniser.l.i = true;
                        tokeniser.q();
                        tokeniser.y(TokeniserState.Data);
                        return;
                    }
                    tokeniser.v(this);
                    tokeniser.l.i = true;
                    tokeniser.q();
                    tokeniser.y(TokeniserState.Data);
                    return;
                }
                tokeniser.y(TokeniserState.AfterDoctypeSystemIdentifier);
                return;
            }
            tokeniser.v(this);
            tokeniser.l.h.a((char) 65533);
        }
    },
    AfterDoctypeSystemIdentifier { // from class: org.jsoup.parser.TokeniserState.66
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != '\t' && s != '\n' && s != '\f' && s != '\r' && s != ' ') {
                if (s != '>') {
                    if (s != 65535) {
                        tokeniser.v(this);
                        tokeniser.y(TokeniserState.BogusDoctype);
                        return;
                    }
                    tokeniser.s(this);
                    tokeniser.l.i = true;
                    tokeniser.q();
                    tokeniser.y(TokeniserState.Data);
                    return;
                }
                tokeniser.q();
                tokeniser.y(TokeniserState.Data);
            }
        }
    },
    BogusDoctype { // from class: org.jsoup.parser.TokeniserState.67
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            char s = characterReader.s();
            if (s != '>') {
                if (s != 65535) {
                    return;
                }
                tokeniser.q();
                tokeniser.y(TokeniserState.Data);
                return;
            }
            tokeniser.q();
            tokeniser.y(TokeniserState.Data);
        }
    },
    CdataSection { // from class: org.jsoup.parser.TokeniserState.68
        @Override // org.jsoup.parser.TokeniserState
        public void p(Tokeniser tokeniser, CharacterReader characterReader) {
            tokeniser.f.b(characterReader.H("]]>"));
            if (!characterReader.a0("]]>") && !characterReader.R()) {
                return;
            }
            tokeniser.n(new Token.CData(tokeniser.f.h()));
            tokeniser.y(TokeniserState.Data);
        }
    };
    
    public static final char l2 = 0;
    public static final char o2 = 65533;
    public static final char q2 = 65535;
    public static final char[] m2 = {'\t', '\n', '\f', C8206nB.d, ' ', '\"', '\'', '/', '<', '=', '>', '?'};
    public static final char[] n2 = {0, '\t', '\n', '\f', C8206nB.d, ' ', '\"', '&', '\'', '<', '=', '>', '`'};
    public static final String p2 = String.valueOf((char) 65533);

    public static void n(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (characterReader.j0()) {
            String y = characterReader.y();
            tokeniser.f.b(y);
            tokeniser.m(y);
            return;
        }
        char s = characterReader.s();
        if (s != '\t' && s != '\n' && s != '\f' && s != '\r' && s != ' ' && s != '/' && s != '>') {
            characterReader.D0();
            tokeniser.y(tokeniserState2);
            return;
        }
        if (tokeniser.f.h().equals(C2730De2.r)) {
            tokeniser.y(tokeniserState);
        } else {
            tokeniser.y(tokeniserState2);
        }
        tokeniser.l(s);
    }

    public static void o(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState) {
        if (characterReader.j0()) {
            String F = characterReader.F();
            tokeniser.j.z(F);
            tokeniser.f.b(F);
            return;
        }
        if (tokeniser.w() && !characterReader.R()) {
            char s = characterReader.s();
            if (s != '\t' && s != '\n' && s != '\f' && s != '\r' && s != ' ') {
                if (s != '/') {
                    if (s != '>') {
                        tokeniser.f.a(s);
                    } else {
                        tokeniser.r();
                        tokeniser.y(Data);
                        return;
                    }
                } else {
                    tokeniser.y(SelfClosingStartTag);
                    return;
                }
            } else {
                tokeniser.y(BeforeAttributeName);
                return;
            }
        }
        tokeniser.m("</");
        tokeniser.m(tokeniser.f.h());
        tokeniser.y(tokeniserState);
    }

    public static void q(Tokeniser tokeniser, TokeniserState tokeniserState) {
        int[] e = tokeniser.e(null, false);
        if (e == null) {
            tokeniser.l('&');
        } else {
            tokeniser.o(e);
        }
        tokeniser.y(tokeniserState);
    }

    public static void r(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        if (characterReader.j0()) {
            tokeniser.i(false);
            tokeniser.y(tokeniserState);
            return;
        }
        tokeniser.m("</");
        tokeniser.y(tokeniserState2);
    }

    public static void s(Tokeniser tokeniser, CharacterReader characterReader, TokeniserState tokeniserState, TokeniserState tokeniserState2) {
        char P = characterReader.P();
        if (P != 0) {
            if (P != '<') {
                if (P != 65535) {
                    tokeniser.m(characterReader.E());
                    return;
                } else {
                    tokeniser.n(new Token.EOF());
                    return;
                }
            }
            tokeniser.a(tokeniserState2);
            return;
        }
        tokeniser.v(tokeniserState);
        characterReader.n();
        tokeniser.l((char) 65533);
    }

    public abstract void p(Tokeniser tokeniser, CharacterReader characterReader);
}
