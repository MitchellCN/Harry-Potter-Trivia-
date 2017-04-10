--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.2
-- Dumped by pg_dump version 9.6.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: trivia_game; Type: TABLE; Schema: public; Owner: cmitchell
--

CREATE TABLE trivia_game (
    question_id integer NOT NULL,
    question character varying(300),
    answer character varying(300),
    answer2 character varying(300),
    answer3 character varying(300),
    answer1 character varying(300)
);


ALTER TABLE trivia_game OWNER TO cmitchell;

--
-- Name: trivia_game_question_id_seq; Type: SEQUENCE; Schema: public; Owner: cmitchell
--

CREATE SEQUENCE trivia_game_question_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE trivia_game_question_id_seq OWNER TO cmitchell;

--
-- Name: trivia_game_question_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: cmitchell
--

ALTER SEQUENCE trivia_game_question_id_seq OWNED BY trivia_game.question_id;


--
-- Name: trivia_game question_id; Type: DEFAULT; Schema: public; Owner: cmitchell
--

ALTER TABLE ONLY trivia_game ALTER COLUMN question_id SET DEFAULT nextval('trivia_game_question_id_seq'::regclass);


--
-- Data for Name: trivia_game; Type: TABLE DATA; Schema: public; Owner: cmitchell
--

COPY trivia_game (question_id, question, answer, answer2, answer3, answer1) FROM stdin;
17	\N	\N	\N	\N	\N
2	What is the street address of the home where the house elves heads are mounted? 	12 Grimmauld Place	4 Privet Drive	31 Spooner Street	322 Maple Circle
3	Who did Harry go out of way to save during the lake portion of the TriWizard Tournament	Gabrielle	Isabelle	Ginny	Cho
4	Who was the third person to possess the Elder Wand?	Emeric the Evil	Hereward	Egbert the Egregious	Gregorovitch
5	What was Bozo's job in Harry Potter?	Photographer	TriWizard Judge	Groundskeeper	Artist
1	Bathilda Bagshot introduced Albus Dumbledore to who?	Gellert Grindelward	Sirius Black	Gregorvitch	Bellatrix LeStrange
6	What house did Hagrid belong to? 	Gryffindor	Hufflepuff	Ravenclaw	Slytherin
7	What job did Stan Shunpike have?	Knight Bus conductor	Knight Bus Driver	Keeper	Seeker
8	How tall is Harry Potter ?	5 feet 5 inches	6 feet 	5 feet 3 inches	5 feet 9 inches
9	How many pages is in Harry Potter and the Philosopher's Stone	223	637	275	175
10	Who directed Harry Potter and the Prisoner of Azkaban	Alfonso Cuarón	Chris Columbus	David Yates	Christopher Nolan
11	Which of these is not a Wizarding School of Magic? 	Maroborough Academy of Fine Magic	Hogwarts School of Witchcraft and Wizardy	Beauxbatons Academy of Magic	Durmstrang Institue
12	Who won the world cup in the Goblet of Fire?	Ireland	Bulgaria	Peru	England
13	Who killed Sirius Black	Bellatrix Lestrange	Severus Snape	Lucius Malfoy	Peter Pettigrew
14	How many ingredients are in a Polyjuice Potion? 	7 	4	3	8
15	What did Harry see the first time he looked in the mirror of Erised?	His family	Winning the Quidditch cup	Becoming an Auror	Beating Hermione Granger on the Charm final
16	How many Horcruxes did Voldemort make? 	7	8	4	3
18	What is Gryffindor’s ghost Nearly Headless Nick full name?	Sir Nicholas de Mimsy-Porpington	Sir Nicholas Flaumei Carte	Sir Nicholas HavdeIe	Sir Nicholas au Charte Mapede
19	How old was Nicolas Flamel when he died?	665	409	399	He never died
20	How many staircases does Hogwarts have? 	142	158	127	187
\.


--
-- Name: trivia_game_question_id_seq; Type: SEQUENCE SET; Schema: public; Owner: cmitchell
--

SELECT pg_catalog.setval('trivia_game_question_id_seq', 20, true);


--
-- Name: trivia_game trivia_game_pkey; Type: CONSTRAINT; Schema: public; Owner: cmitchell
--

ALTER TABLE ONLY trivia_game
    ADD CONSTRAINT trivia_game_pkey PRIMARY KEY (question_id);


--
-- Name: trivia_game_question_id_uindex; Type: INDEX; Schema: public; Owner: cmitchell
--

CREATE UNIQUE INDEX trivia_game_question_id_uindex ON trivia_game USING btree (question_id);


--
-- PostgreSQL database dump complete
--

