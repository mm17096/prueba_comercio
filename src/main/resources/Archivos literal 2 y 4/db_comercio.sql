PGDMP         ;            
    {            bd_comercio    15.3    15.3     
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    19448    bd_comercio    DATABASE     ~   CREATE DATABASE bd_comercio WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Spain.1252';
    DROP DATABASE bd_comercio;
                postgres    false            �            1259    19449 
   tb_cliente    TABLE     �   CREATE TABLE public.tb_cliente (
    codigo_cliente uuid NOT NULL,
    correo character varying(50),
    nombre character varying(25)
);
    DROP TABLE public.tb_cliente;
       public         heap    postgres    false            �            1259    19454    tb_comercio    TABLE     i   CREATE TABLE public.tb_comercio (
    codigo_comercio uuid NOT NULL,
    nombre character varying(25)
);
    DROP TABLE public.tb_comercio;
       public         heap    postgres    false            �            1259    19459 	   tb_compra    TABLE     6  CREATE TABLE public.tb_compra (
    codigo_compra uuid NOT NULL,
    fecha timestamp(6) without time zone,
    lugar character varying(255),
    medio_pago character varying(255),
    monto_total double precision NOT NULL,
    cliente_codigo_cliente uuid,
    comercio_id uuid NOT NULL,
    cliente_id uuid
);
    DROP TABLE public.tb_compra;
       public         heap    postgres    false                      0    19449 
   tb_cliente 
   TABLE DATA           D   COPY public.tb_cliente (codigo_cliente, correo, nombre) FROM stdin;
    public          postgres    false    214   j                 0    19454    tb_comercio 
   TABLE DATA           >   COPY public.tb_comercio (codigo_comercio, nombre) FROM stdin;
    public          postgres    false    215   �                 0    19459 	   tb_compra 
   TABLE DATA           �   COPY public.tb_compra (codigo_compra, fecha, lugar, medio_pago, monto_total, cliente_codigo_cliente, comercio_id, cliente_id) FROM stdin;
    public          postgres    false    216   @       m           2606    19453    tb_cliente tb_cliente_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.tb_cliente
    ADD CONSTRAINT tb_cliente_pkey PRIMARY KEY (codigo_cliente);
 D   ALTER TABLE ONLY public.tb_cliente DROP CONSTRAINT tb_cliente_pkey;
       public            postgres    false    214            o           2606    19458    tb_comercio tb_comercio_pkey 
   CONSTRAINT     g   ALTER TABLE ONLY public.tb_comercio
    ADD CONSTRAINT tb_comercio_pkey PRIMARY KEY (codigo_comercio);
 F   ALTER TABLE ONLY public.tb_comercio DROP CONSTRAINT tb_comercio_pkey;
       public            postgres    false    215            q           2606    19465    tb_compra tb_compra_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.tb_compra
    ADD CONSTRAINT tb_compra_pkey PRIMARY KEY (codigo_compra);
 B   ALTER TABLE ONLY public.tb_compra DROP CONSTRAINT tb_compra_pkey;
       public            postgres    false    216            s           2606    19467 &   tb_compra uk_gasqlp9tg0169dggkppcad472 
   CONSTRAINT     s   ALTER TABLE ONLY public.tb_compra
    ADD CONSTRAINT uk_gasqlp9tg0169dggkppcad472 UNIQUE (cliente_codigo_cliente);
 P   ALTER TABLE ONLY public.tb_compra DROP CONSTRAINT uk_gasqlp9tg0169dggkppcad472;
       public            postgres    false    216            t           2606    19478 %   tb_compra fkiaog6v0ghnnqryhvp3bj9b2l1    FK CONSTRAINT     �   ALTER TABLE ONLY public.tb_compra
    ADD CONSTRAINT fkiaog6v0ghnnqryhvp3bj9b2l1 FOREIGN KEY (cliente_id) REFERENCES public.tb_cliente(codigo_cliente);
 O   ALTER TABLE ONLY public.tb_compra DROP CONSTRAINT fkiaog6v0ghnnqryhvp3bj9b2l1;
       public          postgres    false    214    216    3181            u           2606    19473 %   tb_compra fkrgcb8jsitqjoycajeg4r1rdf0    FK CONSTRAINT     �   ALTER TABLE ONLY public.tb_compra
    ADD CONSTRAINT fkrgcb8jsitqjoycajeg4r1rdf0 FOREIGN KEY (comercio_id) REFERENCES public.tb_comercio(codigo_comercio);
 O   ALTER TABLE ONLY public.tb_compra DROP CONSTRAINT fkrgcb8jsitqjoycajeg4r1rdf0;
       public          postgres    false    216    215    3183            v           2606    19468 %   tb_compra fkt6wasf67l2f85c93uk87ff1hl    FK CONSTRAINT     �   ALTER TABLE ONLY public.tb_compra
    ADD CONSTRAINT fkt6wasf67l2f85c93uk87ff1hl FOREIGN KEY (cliente_codigo_cliente) REFERENCES public.tb_cliente(codigo_cliente);
 O   ALTER TABLE ONLY public.tb_compra DROP CONSTRAINT fkt6wasf67l2f85c93uk87ff1hl;
       public          postgres    false    216    214    3181               T   x�3IM�L6IM�54�H�51M��MJ64�MM2H�0M�LI�L��N-��K��L,�M��LtH�M���K�����(�����b���� V)         b   x�]˱�  ��L��@H0G�4Ȉ*wɅdS���L�jQ�^X�h(d��"������w����������̀�X�C؇X�#�Tog��=���yJ         �   x��1�  �^������ޱ}A����U}#�z�qi�����A�:V�I\[H�2A���x	O=��z�����O �+p�қ4�&WG�BC;7D�جO6J���Ƥ6pIѾf�q�����(�     