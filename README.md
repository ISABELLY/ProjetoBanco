## Projeto Banco
 Projeto iniciado em sala de aula para conclusão da cadeira de programação I.

### Elabore uma classe *Cliente* com os seguintes membros:
- atributo String nome
- atributo int numero
- atributo String dataNascimento
- método get e set

### Elabore uma classe *ContaBancaria* com os seguintes membros:
- atributo Cliente cliente
- atributo int num_conta
- atributo float saldo
- método sacar (o saldo não pode ficar negativo)
- método depositar
- método get e set

### Acrescente ao projeto duas classes herdadas de ContaBancaria: ContaPoupança e ContaEspecial, com as seguintes características a mais:
1. Classe ContaPoupança:
- atributo int diaDeRendimento
- método calcularNovoSaldo, recebe a taxa de rendimento da poupança e atualiza o saldo.
- método get e set
2. Classe ContaEspecial
- atributo float limite
- método sacarEspecial, permitindo saldo negativo até o valor do limite.
- método get e set

### Após a implementação das classes acima, você deverá implementar uma classe Contas.Java,
contendo o método main. Nesta classe, você deverá implementar:
a) Incluir dados relativos a(s) conta(s) de um cliente;
b) Sacar um determinado valor da(s) sua(s) conta(s);
c) Depositar um determinado valor na(s) sua(s) conta(s);
d) Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que possuem conta
poupança;
e) Mostrar os dados da(s) conta(s) de um cliente;

### Fazer integração com BD para armazenar dados de clientes;
